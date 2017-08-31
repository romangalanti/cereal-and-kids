package com.theironyard.app.api;

import static org.assertj.core.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.dao.EmptyResultDataAccessException;

import com.theironyard.app.models.Kid;
import com.theironyard.app.services.KidRepository;

public class KidApiControllerTests {
	
	private KidRepository kidRepo;
	private KidApiController controller;
	
	@Before
	public void setUp() {
		kidRepo = mock(KidRepository.class);
		controller = new KidApiController(kidRepo);
	}

	@Test
	public void test_getAll_returns_all_kids_returned_by_the_repo() {
		// Arrange
		ArrayList<Kid> kids = new ArrayList<Kid>();
		kids.add(new Kid());
		kids.add(new Kid());
		
		when(kidRepo.findAll()).thenReturn(kids);
		
		// Act
		List<Kid> actual = controller.getAll();
		
		// Assert
		assertThat(kids.size()).isEqualTo(2);
		assertThat(actual.get(0)).isSameAs(kids.get(0));
		verify(kidRepo).findAll();
	}
	
	@Test
	public void test_getOne_returns_kid_returned_from_repo() throws StuffNotFoundException {
		// Arrange
		Kid pinocchio = new Kid();
		when(kidRepo.findOne(1010101100L)).thenReturn(pinocchio);
		
		// Act
		Kid actual = controller.getOne(1010101100L);
		
		// Assert
		assertThat(actual).isSameAs(pinocchio);
		verify(kidRepo).findOne(1010101100L);
	}
	
	@Test
	public void test_getOne_throws_stuffNotFound_when_no_kid_returned_from_repo() {
		try {
			controller.getOne(7);
			fail("The controller did not throw the stuffNotFoundException");
		} catch(StuffNotFoundException snfe) {}
	}
	
	@Test
	public void test_delete_returns_kid_deleted_when_found() {
		// Arrange
		Kid kid = new Kid();
		when(kidRepo.findOne(3L)).thenReturn(kid);
		
		// Act
		Kid actual = controller.delete(3L);
		
		//Assert
		assertThat(kid).isSameAs(actual);
		verify(kidRepo).delete(3L);
		verify(kidRepo).findOne(3L);
	}
	
	@Test
	public void test_that_null_is_returned_when_findOne_throws_EmptyResultDataAccessException() throws StuffNotFoundException {
		// Arrange
		when(kidRepo.findOne(8L)).thenThrow(new EmptyResultDataAccessException(0));
		
		// Act
		Kid actual = controller.delete(8L);
		
		// Assert
		assertThat(actual).isNull();
		verify(kidRepo).findOne(8L);
	}

}
