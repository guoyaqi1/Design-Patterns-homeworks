package hk3_facotrypattern;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;


public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new FileReader(new File("property.txt")));
		GameRoles gr = (GameRoles)Class.forName(br.readLine()).newInstance();
		gr.skillEffect();
	}
}
