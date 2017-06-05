package pl.kobietydokodu.cats;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.regex.Pattern;

import pl.kobietydokodu.cats.domain.Cat;

public class Interface
{
	static CatDAO catDao = new CatDAO();
	static Scanner in = new Scanner(System.in);

	
	public static void main(String[] args)
	{
		
		Cat cat = new Cat();
		
		
		System.out.print("Podaj imię kota: ");
		cat.setName(getUserInput());
		
		Pattern datePattern = Pattern.compile("[0-9]{4}\\.[0-1]?[0-9]\\.[0-3]?[0-9]");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd");
        String dateBirthRead=null;
		do
		{
			System.out.print("Podaj datę urodzin kota w formacie RRRR.MM.DD:");
			dateBirthRead = getUserInput();
			if (datePattern.matcher(dateBirthRead).matches())
			{
				try
				{
					cat.setBirthDate(sdf.parse(dateBirthRead));
				} catch (ParseException pe)
				{
					System.out.println("Zły format daty!");
				} 
			}
			
		} while (cat.getBirthDate()==null);
		
		Pattern weightPattern = Pattern.compile("[0-9]+(\\.[0-9]+)?");
        String weightRead;
		do
		{
			System.out.print("Podaj wage kota: ");
			weightRead = getUserInput();
			if (weightPattern.matcher(weightRead).matches())
			{			
					cat.setWeight(Float.valueOf(weightRead));
			}
		} while (cat.getWeight()==null);
		
		System.out.print("Podaj opiekuna: ");
		cat.setOwnerName(getUserInput());
		
		System.out.println("Dziękuję za podanie wszystkich informacji o kocie!");
		
		catDao.addCat(cat);
	}

	public static String getUserInput()
	{
		return in.nextLine().trim();
	}

}
