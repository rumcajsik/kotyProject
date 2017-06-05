package pl.kobietydokodu.cats;
import java.util.ArrayList;
import java.util.LinkedList;

import pl.kobietydokodu.cats.domain.Cat;

public class CatDAO
{
	LinkedList<Cat> cats = new LinkedList<Cat>();

	public void addCat(Cat cat)
	{
		cats.add(cat);
		System.out.println("Kot został dodany do kolekcji!");
	}
}
