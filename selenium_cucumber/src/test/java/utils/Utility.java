package utils;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Utility {

	public static List<String> webElementToStringList(List<WebElement> list){
		List<String> list1=new ArrayList<String>();
		list.forEach(el -> list1.add(el.getText()));
		return list1;
	}
	
	
}
