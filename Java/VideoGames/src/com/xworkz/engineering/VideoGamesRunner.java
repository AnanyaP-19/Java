package com.xworkz.engineering;
import com.xworkz.engineering.VideoGames;
public class VideoGamesRunner {

	public static void main(String[] args) {
		
		VideoGames videoGames1=new VideoGames("LudoKing",2,200);
		VideoGames videoGames2=new VideoGames("Carem",2,100);
		VideoGames videoGames3=new VideoGames("Chess",2,250);
		
		VideoGames videoGames[]= {videoGames1,videoGames2,videoGames3};
		System.out.println("VideoGames length:"+videoGames.length);
		
		for(int start=0;start<videoGames.length;start++)
		{
			VideoGames ref=videoGames[start];
			ref.show();
		}
	}

}
