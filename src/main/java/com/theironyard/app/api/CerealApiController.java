package com.theironyard.app.api;

import java.util.List;

import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.theironyard.app.models.Cereal;
import com.theironyard.app.models.CerealManufacturer;
import com.theironyard.app.services.CerealManufacturerRepository;
import com.theironyard.app.services.CerealRepository;

@RestController
@RequestMapping("/api/cereals")
public class CerealApiController {

	private CerealRepository cerealRepo;
	
	public CerealApiController(CerealRepository cerealRepo, CerealManufacturerRepository manuRepo) {
		this.cerealRepo = cerealRepo;
		
		cerealRepo.save(new Cereal("All-Bran", 1980));
		cerealRepo.save(new Cereal("Almond", 1975));
		cerealRepo.save(new Cereal("Alpha-Bits", 2002));
		cerealRepo.save(new Cereal("Animal Planet", 1974));
		cerealRepo.save(new Cereal("Apple Cinnamon", 1966));
		cerealRepo.save(new Cereal("Apple DJ Crashers", 1979));
		cerealRepo.save(new Cereal("Apple Jacks", 1990));
		cerealRepo.save(new Cereal("Apple Jacks Apple Clones", 2000));
		cerealRepo.save(new Cereal("Apple Jacks Double Vision", 1979));
		cerealRepo.save(new Cereal("Apple Raisin Crisp", 1983));
		cerealRepo.save(new Cereal("Apple Zingaroos", 1969));
		cerealRepo.save(new Cereal("Apple Zings", 1997));
		cerealRepo.save(new Cereal("Avalanche Swiss Granola", 1994));
		cerealRepo.save(new Cereal("Banana Frosted Flakes", 2000));
		cerealRepo.save(new Cereal("Banana Nut", 1968));
		cerealRepo.save(new Cereal("Berry", 1983));
		cerealRepo.save(new Cereal("Berry Burst", 1974));
		cerealRepo.save(new Cereal("Birthday Confetti Frosted Flakes", 1964));
		cerealRepo.save(new Cereal("Bite Size Frosted Blueberry Muffin", 1975));
		cerealRepo.save(new Cereal("Bite Size Frosted Chocolate", 1996));
		cerealRepo.save(new Cereal("Bite Size Frosted Cinnamon Streusel", 2001));
		cerealRepo.save(new Cereal("Bite Size Frosted Maple and Brown Sugar", 1985));
		cerealRepo.save(new Cereal("Bite Size Frosted Mini-Wheats with Brown Sugar", 2001));
		cerealRepo.save(new Cereal("Bite Size Frosted Strawberry Delight", 1971));
		cerealRepo.save(new Cereal("Bite Size Frosted Vanilla Cr", 1998));
		cerealRepo.save(new Cereal("Breakfast cereal", 1979));
		cerealRepo.save(new Cereal("Cabbage Patch Kids", 2014));
		cerealRepo.save(new Cereal("Cap'n Crunch", 1980));
		cerealRepo.save(new Cereal("Captain Planet", 2001));
		cerealRepo.save(new Cereal("Caramel", 1965));
		cerealRepo.save(new Cereal("Ceccettio's", 1979));
		cerealRepo.save(new Cereal("Chex", 2008));
		cerealRepo.save(new Cereal("Chocapic", 1977));
		cerealRepo.save(new Cereal("Chocolate", 1981));
		cerealRepo.save(new Cereal("Chocolate Donutz", 1977));
		cerealRepo.save(new Cereal("Chocolate Peanut Butter", 2000));
		cerealRepo.save(new Cereal("Chocos", 2012));
		cerealRepo.save(new Cereal("Cinnabon", 1985));
		cerealRepo.save(new Cereal("Cinnamon", 1969));
		cerealRepo.save(new Cereal("Cinnamon Burst", 1967));
		cerealRepo.save(new Cereal("Cinnamon Marshmallow", 1980));
		cerealRepo.save(new Cereal("Cinnamon Nut", 1999));
		cerealRepo.save(new Cereal("Cinnamon Toast Crunch", 1973));
		cerealRepo.save(new Cereal("Cinnamon Toasters", 2002));
		cerealRepo.save(new Cereal("CinnaScary Apple Jacks", 1981));
		cerealRepo.save(new Cereal("Circus Fun", 1974));
		cerealRepo.save(new Cereal("Clackers cereal", 2015));
		cerealRepo.save(new Cereal("Clusters", 1967));
		cerealRepo.save(new Cereal("Coco Roos", 1985));
		cerealRepo.save(new Cereal("CoCo Wheats", 2001));
		cerealRepo.save(new Cereal("Cocoa Freakies", 2009));
		cerealRepo.save(new Cereal("Cocoa Frosted Flakes", 1974));
		cerealRepo.save(new Cereal("Cocoa Hoots", 1993));
		cerealRepo.save(new Cereal("Cocoa Krispies", 1966));
		cerealRepo.save(new Cereal("Cocoa Pebbles", 2016));
		cerealRepo.save(new Cereal("Cocoa Puffs", 1978));
		cerealRepo.save(new Cereal("Cocoa Puffs Brownie Crunch", 2001));
		cerealRepo.save(new Cereal("Cocoa Puffs Combos", 1965));
		cerealRepo.save(new Cereal("Colossal Crunch", 1984));
		cerealRepo.save(new Cereal("Comet Balls", 2015));
		cerealRepo.save(new Cereal("Complete", 1987));
		cerealRepo.save(new Cereal("Concentrate", 2017));
		cerealRepo.save(new Cereal("Cookie Crisp", 1999));
		cerealRepo.save(new Cereal("Corn", 1991));
		cerealRepo.save(new Cereal("Corn Bran", 1968));
		cerealRepo.save(new Cereal("Corn Bran Squares", 1973));
		cerealRepo.save(new Cereal("Corn Bursts", 2010));
		cerealRepo.save(new Cereal("Corn flakes", 2000));
		cerealRepo.save(new Cereal("Corn Pops", 1971));
		cerealRepo.save(new Cereal("Corn Soya", 1996));
		cerealRepo.save(new Cereal("Corny Snaps", 2010));
		cerealRepo.save(new Cereal("Cracker Jack", 1977));
		cerealRepo.save(new Cereal("Cracklin' Oat Bran", 1964));
		cerealRepo.save(new Cereal("Cran-Vanilla Crunch", 2004));
		cerealRepo.save(new Cereal("Cranberry Almond Crunch", 2001));
		cerealRepo.save(new Cereal("Cranberry Wheats", 2014));
		cerealRepo.save(new Cereal("Crazy Cow", 2009));
		cerealRepo.save(new Cereal("Crazy Flakes", 2014));
		cerealRepo.save(new Cereal("Cream of Wheat", 2017));
		cerealRepo.save(new Cereal("Crispix", 1990));
		cerealRepo.save(new Cereal("Crispy Critters", 1980));
		cerealRepo.save(new Cereal("Crispy Rice", 1977));
		cerealRepo.save(new Cereal("Crispy Wheats 'n Raisins", 1975));
		cerealRepo.save(new Cereal("Cruncheroos", 2004));
		cerealRepo.save(new Cereal("Crunchy Bran", 1994));
		cerealRepo.save(new Cereal("Crunchy Corn Bran", 2010));
		cerealRepo.save(new Cereal("Crunchy Nut Cornflakes", 1993));
		cerealRepo.save(new Cereal("Dinersaurs", 1991));
		cerealRepo.save(new Cereal("Dinky Donuts", 1970));
		cerealRepo.save(new Cereal("Disney Hunny B's Honey-Graham", 1985));
		cerealRepo.save(new Cereal("Disney Mickey's Magix", 1995));
		cerealRepo.save(new Cereal("Donkey Kong Crunch", 2008));
		cerealRepo.save(new Cereal("Donkey Kong Jr. Cereal", 1972));
		cerealRepo.save(new Cereal("Double", 1970));
		cerealRepo.save(new Cereal("Double Dip Crunch", 2001));
		cerealRepo.save(new Cereal("Dudley Do-Right", 1981));
		cerealRepo.save(new Cereal("Dunkin' Donuts", 2014));
		cerealRepo.save(new Cereal("Dyno-Bites", 2011));
		cerealRepo.save(new Cereal("E.T. the Extra-Terrestrial", 1969));
		cerealRepo.save(new Cereal("Eggo", 1999));
		cerealRepo.save(new Cereal("Elixir Cereals", 1980));
		cerealRepo.save(new Cereal("Engine 2", 1975));
		cerealRepo.save(new Cereal("Fantuz Flakes", 2002));
		cerealRepo.save(new Cereal("Fiber One", 1974));
		cerealRepo.save(new Cereal("Flutie Flakes", 1966));
		cerealRepo.save(new Cereal("Force", 1979));
		cerealRepo.save(new Cereal("Fortified Oat Flakes", 1990));
		cerealRepo.save(new Cereal("Freakies", 2000));
		cerealRepo.save(new Cereal("French Toast Crunch", 1979));
		cerealRepo.save(new Cereal("Froot Loops", 1983));
		cerealRepo.save(new Cereal("Frosted", 1969));
		cerealRepo.save(new Cereal("Frosted Flakes", 1997));
		cerealRepo.save(new Cereal("Frosted Flakes", 1994));
		cerealRepo.save(new Cereal("Frosted Flakes Chocolate", 2000));
		cerealRepo.save(new Cereal("Frosted Flakes Gold", 1968));
		cerealRepo.save(new Cereal("Frosted Mini Spooners", 1983));
		cerealRepo.save(new Cereal("Frosted Mini-Wheats", 1974));
		cerealRepo.save(new Cereal("Frosted Mini-Wheats Big Bite", 1964));
		cerealRepo.save(new Cereal("Frosted Mini-Wheats Strawberry Delight", 1975));
		cerealRepo.save(new Cereal("Frosted Shredded Wheat", 1996));
		cerealRepo.save(new Cereal("Frosted Toast Crunch", 2001));
		cerealRepo.save(new Cereal("Frosties", 1985));
		cerealRepo.save(new Cereal("Frosty O's", 2001));
		cerealRepo.save(new Cereal("Fruit", 1971));
		cerealRepo.save(new Cereal("Fruit 'n Fibre", 1998));
		cerealRepo.save(new Cereal("Fruit Harvest", 1979));
		cerealRepo.save(new Cereal("Fruit Islands", 2014));
		cerealRepo.save(new Cereal("Fruit Wheats", 1980));
		cerealRepo.save(new Cereal("Fruity", 2001));
		cerealRepo.save(new Cereal("Fruity Dyno-bites", 1965));
		cerealRepo.save(new Cereal("Fruity Freakies", 1979));
		cerealRepo.save(new Cereal("Fruity Pebbles", 2008));
		cerealRepo.save(new Cereal("Futurelife SmartFood", 1977));
		cerealRepo.save(new Cereal("G.I. Joe", 1981));
		cerealRepo.save(new Cereal("Gaia Muesli", 1977));
		cerealRepo.save(new Cereal("Ghostbusters", 2000));
		cerealRepo.save(new Cereal("Ghostbusters II", 2012));
		cerealRepo.save(new Cereal("Go Lean Cereal", 1985));
		cerealRepo.save(new Cereal("Golden Crisp", 1969));
		cerealRepo.save(new Cereal("Golden Goals", 1967));
		cerealRepo.save(new Cereal("Golden Grahams", 1980));
		cerealRepo.save(new Cereal("Golden Nuggets", 1999));
		cerealRepo.save(new Cereal("Golden Oaties", 1973));
		cerealRepo.save(new Cereal("Golden Puffs", 2002));
		cerealRepo.save(new Cereal("Good Friends", 1981));
		cerealRepo.save(new Cereal("Gorilla Munch", 1974));
		cerealRepo.save(new Cereal("Granola", 2015));
		cerealRepo.save(new Cereal("Granolove", 1967));
		cerealRepo.save(new Cereal("Granula", 1985));
		cerealRepo.save(new Cereal("Grape Nut Flakes", 2001));
		cerealRepo.save(new Cereal("Grape-Nuts", 2009));
		cerealRepo.save(new Cereal("Gremlins", 1974));
		cerealRepo.save(new Cereal("Grins", 1993));
		cerealRepo.save(new Cereal("Guardian Cinnamon with a hint of vanilla flavour", 1966));
		cerealRepo.save(new Cereal("Guardian Original with a hint of maple flavour", 2016));
		cerealRepo.save(new Cereal("Halfsies", 1978));
		cerealRepo.save(new Cereal("Harvest Crunch", 2001));
		cerealRepo.save(new Cereal("Heart to Heart", 1965));
		cerealRepo.save(new Cereal("Hershey's Cookies 'n' Creme", 1984));
		cerealRepo.save(new Cereal("Hidden Treasures", 2015));
		cerealRepo.save(new Cereal("High School Musical", 1987));
		cerealRepo.save(new Cereal("Homer Simpson", 2017));
		cerealRepo.save(new Cereal("Honey", 1999));
		cerealRepo.save(new Cereal("Honey Bunches of Oats", 1991));
		cerealRepo.save(new Cereal("Honey Bunches of Oats Fruit Blends", 1968));
		cerealRepo.save(new Cereal("Honey Bunches of Oats Just Bunches", 1973));
		cerealRepo.save(new Cereal("Honey Bunches of Oats with Almonds", 2010));
		cerealRepo.save(new Cereal("Honey Bunches of Oats with Apples with Cinnamon Bunches", 2000));
		cerealRepo.save(new Cereal("Honey Bunches of Oats with Bananas", 1971));
		cerealRepo.save(new Cereal("Honey Bunches of Oats with Chocolate Clusters", 1996));
		cerealRepo.save(new Cereal("Honey Bunches of Oats with Cinnamon Clusters", 2010));
		cerealRepo.save(new Cereal("Honey Bunches of Oats with Peaches", 1977));
		cerealRepo.save(new Cereal("Honey Bunches of Oats with Strawberries", 1964));
		cerealRepo.save(new Cereal("Honey Bunches of Oats with Vanilla Clusters", 2004));
		cerealRepo.save(new Cereal("Honey Bunny", 2001));
		cerealRepo.save(new Cereal("Honey Buzzers", 2014));
		cerealRepo.save(new Cereal("Honey Crisps", 2009));
		cerealRepo.save(new Cereal("Honey Cups", 2014));
		cerealRepo.save(new Cereal("Honey Graham", 2017));
		cerealRepo.save(new Cereal("Honey Graham Squares", 1990));
		cerealRepo.save(new Cereal("Honey Maid", 1980));
		cerealRepo.save(new Cereal("Honey Nut", 1977));
		cerealRepo.save(new Cereal("Honey Nut Cheerios", 1975));
		cerealRepo.save(new Cereal("Honey Nut Clusters", 2004));
		cerealRepo.save(new Cereal("Honey Nut Shredded Wheat", 1994));
		cerealRepo.save(new Cereal("Honey Nut Toasty O's", 2010));
		cerealRepo.save(new Cereal("Honey Puffs", 1993));
		cerealRepo.save(new Cereal("Honey Smacks", 1991));
		cerealRepo.save(new Cereal("Honey Stars", 1970));
		cerealRepo.save(new Cereal("Honey-ful Wheat", 1985));
		cerealRepo.save(new Cereal("Honeycomb", 1995));
		cerealRepo.save(new Cereal("Honeycomb Strawberry", 2008));
		cerealRepo.save(new Cereal("Hot Wheels", 1972));
		cerealRepo.save(new Cereal("http://www.kelloggs.com/promotions/starwars/ee", 1970));
		cerealRepo.save(new Cereal("Hulk", 2001));
		cerealRepo.save(new Cereal("Ice Cream Cones", 1981));
		cerealRepo.save(new Cereal("Jets", 2014));
		cerealRepo.save(new Cereal("Jif", 2011));
		cerealRepo.save(new Cereal("Just Right", 1969));
		cerealRepo.save(new Cereal("Kaboom", 1999));
		cerealRepo.save(new Cereal("Kashi- Indigo Morning, NON GMO, Organic", 1980));
		cerealRepo.save(new Cereal("Keebler Company", 1975));
		cerealRepo.save(new Cereal("Kellogg Company", 2002));
		cerealRepo.save(new Cereal("King Vitaman", 1974));
		cerealRepo.save(new Cereal("Kix", 1966));
		cerealRepo.save(new Cereal("Krave", 1979));
		cerealRepo.save(new Cereal("Krispy Kritters", 1990));
		cerealRepo.save(new Cereal("Krumbles-Kellogg's", 2000));
		cerealRepo.save(new Cereal("Krunchios", 1979));
		cerealRepo.save(new Cereal("Krusty-O's", 1983));
		cerealRepo.save(new Cereal("Kung Fu Panda", 1969));
		cerealRepo.save(new Cereal("Less Sugar Frosted Flakes", 1997));
		cerealRepo.save(new Cereal("Life", 1994));
		cerealRepo.save(new Cereal("List of breakfast cereal advertising characters", 2000));
		cerealRepo.save(new Cereal("List of breakfast foods", 1968));
		cerealRepo.save(new Cereal("List of breakfast topics", 1983));
		cerealRepo.save(new Cereal("List of Nestl", 1974));
		cerealRepo.save(new Cereal("Little Bites Chocolate", 1964));
		cerealRepo.save(new Cereal("Little Bites Original", 1975));
		cerealRepo.save(new Cereal("Low Fat Granola Cereal", 1996));
		cerealRepo.save(new Cereal("Lucky Charms", 2001));
		cerealRepo.save(new Cereal("Magic Puffs Cereal", 1985));
		cerealRepo.save(new Cereal("Mallow Oats", 2001));
		cerealRepo.save(new Cereal("Maple", 1971));
		cerealRepo.save(new Cereal("Marshmallow Mateys", 1998));
		cerealRepo.save(new Cereal("Maximize", 1979));
		cerealRepo.save(new Cereal("Maypo", 2014));
		cerealRepo.save(new Cereal("Mickey Mouse", 1980));
		cerealRepo.save(new Cereal("Milo Cereal", 2001));
		cerealRepo.save(new Cereal("Milo Crunchy Bites", 1965));
		cerealRepo.save(new Cereal("Milo Duo", 1979));
		cerealRepo.save(new Cereal("Mini Cinnamon Churros", 2008));
		cerealRepo.save(new Cereal("Mini Swirlz", 1977));
		cerealRepo.save(new Cereal("Monster cereals", 1981));
		cerealRepo.save(new Cereal("Monsters University", 1977));
		cerealRepo.save(new Cereal("Moonstones", 2000));
		cerealRepo.save(new Cereal("Morning Funnies", 2012));
		cerealRepo.save(new Cereal("Most", 1985));
		cerealRepo.save(new Cereal("Mr. T Cereal", 1969));
		cerealRepo.save(new Cereal("Mr. Wonderful's Surprise", 1967));
		cerealRepo.save(new Cereal("Muesli", 1980));
		cerealRepo.save(new Cereal("Mueslix", 1999));
		cerealRepo.save(new Cereal("Muffets", 1973));
		cerealRepo.save(new Cereal("Multi-Bran", 2002));
		cerealRepo.save(new Cereal("MultiGrain", 1981));
		cerealRepo.save(new Cereal("MultiGrain Dark Chocolate Crunch Cheerios", 1974));
		cerealRepo.save(new Cereal("MultiGrain Peanut Butter Crunch Cheerios", 2015));
		cerealRepo.save(new Cereal("Neopets", 1967));
		cerealRepo.save(new Cereal("Nerds", 1985));
		cerealRepo.save(new Cereal("Nesquik", 2001));
		cerealRepo.save(new Cereal("Nickelodeon", 2009));
		cerealRepo.save(new Cereal("Nintendo Cereal System", 1974));
		cerealRepo.save(new Cereal("Nion-Nion", 1993));
		cerealRepo.save(new Cereal("Nut 'n Honey", 1966));
		cerealRepo.save(new Cereal("Nutri-Grain", 2016));
		cerealRepo.save(new Cereal("O.J.s", 1978));
		cerealRepo.save(new Cereal("Oat Bran Squares", 2001));
		cerealRepo.save(new Cereal("Oat Cluster", 1965));
		cerealRepo.save(new Cereal("Oat Crisp", 1984));
		cerealRepo.save(new Cereal("Oat Krunchies", 2015));
		cerealRepo.save(new Cereal("Oatbake", 1987));
		cerealRepo.save(new Cereal("Oatbox Cereal Co.", 2017));
		cerealRepo.save(new Cereal("Oatibix", 1999));
		cerealRepo.save(new Cereal("Oatmeal Crisp", 1991));
		cerealRepo.save(new Cereal("Oatmeal Squares", 1968));
		cerealRepo.save(new Cereal("Oats", 1973));
		cerealRepo.save(new Cereal("Oh's", 2010));
		cerealRepo.save(new Cereal("oho", 2000));
		cerealRepo.save(new Cereal("Ohs", 1971));
		cerealRepo.save(new Cereal("OKs", 1996));
		cerealRepo.save(new Cereal("Optima Fruit", 2010));
		cerealRepo.save(new Cereal("Optivita", 1977));
		cerealRepo.save(new Cereal("Orange Blossom", 1964));
		cerealRepo.save(new Cereal("Oreo O's", 2004));
		cerealRepo.save(new Cereal("Organic Wild Puffs", 2001));
		cerealRepo.save(new Cereal("Pac-Man", 2014));
		cerealRepo.save(new Cereal("Palaseja", 2009));
		cerealRepo.save(new Cereal("Pebbles cereal", 2014));
		cerealRepo.save(new Cereal("Pebbles Cereal", 2017));
		cerealRepo.save(new Cereal("Pep Cereal", 1990));
		cerealRepo.save(new Cereal("Pink Panther", 1980));
		cerealRepo.save(new Cereal("Pirates of the Caribbean", 1977));
		cerealRepo.save(new Cereal("Pok", 1975));
		cerealRepo.save(new Cereal("Pop-Tarts", 2004));
		cerealRepo.save(new Cereal("Powdered Donutz", 1994));
		cerealRepo.save(new Cereal("Pro Grain Cereal", 2010));
		cerealRepo.save(new Cereal("Pro Stars", 1993));
		cerealRepo.save(new Cereal("Product 19", 1991));
		cerealRepo.save(new Cereal("Pronutro,", 1970));
		cerealRepo.save(new Cereal("Prophet's Pastry Pops", 1985));
		cerealRepo.save(new Cereal("Puff", 1995));
		cerealRepo.save(new Cereal("Puffa Puffa Rice", 2008));
		cerealRepo.save(new Cereal("Puffed rice", 1972));
		cerealRepo.save(new Cereal("Puffed Wheat", 1970));
		cerealRepo.save(new Cereal("Puffins cereal", 2001));
		cerealRepo.save(new Cereal("Puffkins", 1981));
		cerealRepo.save(new Cereal("Quaker Oats", 2014));
		cerealRepo.save(new Cereal("Quaker Oats Company", 2011));
		cerealRepo.save(new Cereal("Quisp", 1969));
		cerealRepo.save(new Cereal("Rail Road tracks", 1999));
		cerealRepo.save(new Cereal("Rainbow Brite", 1980));
		cerealRepo.save(new Cereal("Raisin Bran", 1975));
		cerealRepo.save(new Cereal("Raisin Crisps", 2002));
		cerealRepo.save(new Cereal("Raisin Squares", 1974));
		cerealRepo.save(new Cereal("Raisin Wheats", 1966));
		cerealRepo.save(new Cereal("Ready Brek", 1979));
		cerealRepo.save(new Cereal("Reese's Puffs", 1990));
		cerealRepo.save(new Cereal("Reptar", 2000));
		cerealRepo.save(new Cereal("Rice", 1979));
		cerealRepo.save(new Cereal("Rice Honeys", 1983));
		cerealRepo.save(new Cereal("Rice Krinkles", 1969));
		cerealRepo.save(new Cereal("Rice Krispies", 1997));
		cerealRepo.save(new Cereal("Richard Petty 43's", 1994));
		cerealRepo.save(new Cereal("Rip's Big Bowl", 2000));
		cerealRepo.save(new Cereal("Rocky Mountain Chocolate Factory", 1968));
		cerealRepo.save(new Cereal("Rocky Road Cereal", 1983));
		cerealRepo.save(new Cereal("S.W. Graham", 1974));
		cerealRepo.save(new Cereal("S'mores Grahams", 1964));
		cerealRepo.save(new Cereal("Scooby-Doo", 1975));
		cerealRepo.save(new Cereal("Sesame Street", 1996));
		cerealRepo.save(new Cereal("Shreddd Spoonfuls", 2001));
		cerealRepo.save(new Cereal("Shredded Oats", 1985));
		cerealRepo.save(new Cereal("Shredded Wheat", 2001));
		cerealRepo.save(new Cereal("Shreddies", 1971));
		cerealRepo.save(new Cereal("Shrek", 1998));
		cerealRepo.save(new Cereal("Sir Grapefellow", 1979));
		cerealRepo.save(new Cereal("Smart Bran", 2014));
		cerealRepo.save(new Cereal("Smorz", 1980));
		cerealRepo.save(new Cereal("Snow Flakes", 2001));
		cerealRepo.save(new Cereal("Special K", 1965));
		cerealRepo.save(new Cereal("Spider-Man", 1979));
		cerealRepo.save(new Cereal("Spider-Man 3", 2008));
		cerealRepo.save(new Cereal("SpongeBob SquarePants", 1977));
		cerealRepo.save(new Cereal("Sprinkle Spangles", 1981));
		cerealRepo.save(new Cereal("Stars", 1977));
		cerealRepo.save(new Cereal("Start", 2000));
		cerealRepo.save(new Cereal("Steve Urkel", 2012));
		cerealRepo.save(new Cereal("Strawberry", 1985));
		cerealRepo.save(new Cereal("Strawberry Shortcake", 1969));
		cerealRepo.save(new Cereal("Strawberry Squares", 1967));
		cerealRepo.save(new Cereal("Sugar", 1980));
		cerealRepo.save(new Cereal("Sugar Jets", 1999));
		cerealRepo.save(new Cereal("Sugar Puffs", 1973));
		cerealRepo.save(new Cereal("Sugar Smacks", 2002));
		cerealRepo.save(new Cereal("Sugar Sprinkled Twinkles", 1981));
		cerealRepo.save(new Cereal("Sun Crunchers", 1974));
		cerealRepo.save(new Cereal("Sun Flakes", 2015));
		cerealRepo.save(new Cereal("Superman", 1967));
		cerealRepo.save(new Cereal("Sweetened Wheat-fuls", 1985));
		cerealRepo.save(new Cereal("Team", 2001));
		cerealRepo.save(new Cereal("Team Flakes", 2009));
		cerealRepo.save(new Cereal("Teddy Grahams", 1974));
		cerealRepo.save(new Cereal("Teenage Mutant Ninja Turtles", 1993));
		cerealRepo.save(new Cereal("Temptations French Vanilla Cereal", 1966));
		cerealRepo.save(new Cereal("Temptations Honey Roasted Pecan Cereal", 2016));
		cerealRepo.save(new Cereal("The California Raisins", 1978));
		cerealRepo.save(new Cereal("The Fairly OddParents", 2001));
		cerealRepo.save(new Cereal("The Lost World: Jurassic Park", 1965));
		cerealRepo.save(new Cereal("The Real Ghostbusters", 1984));
		cerealRepo.save(new Cereal("The Smurfs", 2015));
		cerealRepo.save(new Cereal("Timon and Pumbaa", 1987));
		cerealRepo.save(new Cereal("Tiny Toon Adventures", 2017));
		cerealRepo.save(new Cereal("Toasted Cinnamon Squares", 1999));
		cerealRepo.save(new Cereal("Toasted Wheat-fuls", 1991));
		cerealRepo.save(new Cereal("Toasties", 1968));
		cerealRepo.save(new Cereal("Tony's Turboz", 1973));
		cerealRepo.save(new Cereal("Total", 2010));
		cerealRepo.save(new Cereal("Touch of Fruit in the Middle Mixed Berry", 2000));
		cerealRepo.save(new Cereal("Triple Snack", 1971));
		cerealRepo.save(new Cereal("Triples", 1996));
		cerealRepo.save(new Cereal("Trix", 2010));
		cerealRepo.save(new Cereal("Turbo", 1977));
		cerealRepo.save(new Cereal("Twinkles", 1964));
		cerealRepo.save(new Cereal("Ultima Organic Cereals", 2004));
		cerealRepo.save(new Cereal("Uncle Sam Cereal", 2001));
		cerealRepo.save(new Cereal("Under Cover Bears Instant Oatmeal", 2014));
		cerealRepo.save(new Cereal("Unfrosted Mini-Wheats", 2009));
		cerealRepo.save(new Cereal("Vanilla Life", 2014));
		cerealRepo.save(new Cereal("Vector", 2017));
		cerealRepo.save(new Cereal("Veggie O's", 1990));
		cerealRepo.save(new Cereal("Very Berry", 1980));
		cerealRepo.save(new Cereal("Vive", 1977));
		cerealRepo.save(new Cereal("Wackies", 1975));
		cerealRepo.save(new Cereal("Waffelos", 2004));
		cerealRepo.save(new Cereal("Waffle Crisp", 1994));
		cerealRepo.save(new Cereal("Wayne Chrebet", 2010));
		cerealRepo.save(new Cereal("Weet-Bix", 1993));
		cerealRepo.save(new Cereal("Weetabix", 1991));
		cerealRepo.save(new Cereal("Weetos", 1970));
		cerealRepo.save(new Cereal("Wheat", 1985));
		cerealRepo.save(new Cereal("Wheat Honeys", 1995));
		cerealRepo.save(new Cereal("Wheatena", 2008));
		cerealRepo.save(new Cereal("Wheaties", 1972));
		cerealRepo.save(new Cereal("X-treme Fiber N' Berries", 1970));
		cerealRepo.save(new Cereal("Yog-Active", 2001));
		cerealRepo.save(new Cereal("Yogurt Burst", 1981));
		cerealRepo.save(new Cereal("Zany Fruits", 2014));
		
		CerealManufacturer manu = new CerealManufacturer("Bob's Burgers");
		manu = manuRepo.save(manu);

		for (Cereal cereal : cerealRepo.findAll()) {
			cereal.setManufacturer(manu);
			cerealRepo.save(cereal);
		}
	}
	
	@GetMapping("")
	public List<Cereal> getAll(Integer year, String partialName) {
		List<Cereal> returnList;
		
		if (year != null && partialName != null) {
			returnList = cerealRepo.findByYearIntroducedEqualsAndNameContaining(year, partialName);
		}
		
		else if (partialName != null) {
			returnList = cerealRepo.findByNameContaining(partialName);
		}
		
		else if (year != null) {
			returnList = cerealRepo.findByYearIntroducedEquals(year);
		}
		
		else {
			returnList = cerealRepo.findAll();
		}
		
		return returnList;
	}
	
	@GetMapping("{id}")
	public Cereal getOne(@PathVariable long id) {
		return cerealRepo.findOne(id);
	}
	
	@DeleteMapping("{id}")
	public Cereal delete(@PathVariable long id) {
		try {
			Cereal cereal = cerealRepo.findOne(id);
			cerealRepo.delete(id);
			return cereal;
		} catch (EmptyResultDataAccessException erdae) {
			return null;
		}
	}
	
	@PostMapping("")
	public Cereal create(@RequestBody Cereal cereal) {
		return cerealRepo.save(cereal);
	}
	
	@PutMapping("{id}")
	public Cereal update(@RequestBody Cereal cereal, @PathVariable long id) {
		cereal.setId(id);
		return cerealRepo.save(cereal);
	}
	
}















