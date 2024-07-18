class Country
{
	public static void statesNames(String states)
	{
		System.out.println("start the method");
		String[] container={"Andra Prades","Arunachal Pradesh","Assam","Bihar","Chhattisgarh","Goa","Gujarat","Haryana",
		"Himachal Pradesh","Jharkhand","Karnataka","Kerala","Madya Pradesh","Maharashtra","Manipur","Meghalaya","Mizoram",
		"Nagaland","Odisha","Punjab","Rajastan","Sikkim","Tamil Nadu","Telangana","Tripura","Uttar Pradesh",
		"Jammu and Kashmir","Uttarkand","West Bengal"};
		for(int start=0;start<container.length;start++)
		{
			String ref=container[start];
			System.out.println("State Names:"+ref);
		}
		System.out.println("ends the method");
	}
	
    public static void pincode(int pincodes)
	{
		System.out.println("start the method");
		int[] container1={577227,577429,580007,577419,580118,581103,581121,581129,581186,581187};
		for(int begin=0;begin<container1.length;begin++)
		{
			int ref1=container1[begin];
			System.out.println("State pincodes:"+ref1);
		}
		System.out.println("ends the method");
	}
	
	public static void primeMinister(String primeMinisters)
	{
		System.out.println("start the method");
		String[] container2={"Narendra Modi","Manmohan Singh","Atal Bihari Vajpayee","Inder Kumar gujral","H.D.Deve Gowda",
		"P.V.Narasimha Rao","Chandra Shekar","V.P.Singh","Rajiv gandhi","Indira gandhi","Charah Singh","Morarji Desai",
		"Gulzarilal nanda","Lal Bahadur Shastri","Jawaharlal Nehru"};
		for(int run=0;run<container2.length;run++)
		{
			String ref2=container2[run];
			System.out.println("PrimeMinisters of India:"+ref2);
		}
		System.out.println("ends the method");
	}
	
	public static void cabinetMinister(String cabinetMinisters)
	{
		System.out.println("start the method");
		String[] container3={"Shri Rajnath Singh","Shri Amith Shah","Shri Nitin Jairam Gaakari","Smt. Nirmala Siharaman",
		"Shri Shivraj Singh Chauhan","Dr. Surahmanyam Jaishankar","Shri Jagat Prakash nadda","Shri manohar lal",
		"Shri H.D. Kumarswamy","Shri Piyush Goyal","Shri Dharmendra Pradan","Shri Jitin Ram Manjhi","Shri Rajiv ranjan Singh",
		"Shri Sarbananda Sonowal","Dr Virendra Kumar","Shri Kinjarap Rammahan Naidu","Shri Pralhad Jashi","Shri Julal Oram",
		"Shri Giriraj Singh","Shri Chirag paswan","Shri C R PAtil","Shri G.Kishan Reddy","Dr.Manusukh Mandaviya",
		"Shri Hardeep Singh Puri","Shri Kiren Rijiju","Smt.Annpurna Devi","Shri Gajendra Singh Shekhawat","Shri Bhupendra yadav",
		"Shri Jyotiraditya M.Scindia","Shri Ashwini Vaishnaw"};
		for(int name=0;name<container3.length;name++)
		{
			String ref3=container3[name];
			System.out.println("PrimeMinisters of India:"+ref3);
		}
		System.out.println("ends the method");
	}
	
	public static void politicalParty(String politicalParties)
	{
		System.out.println("start the method");
		String[] container4={"BJP","Congress","JDS","Prajakiya","NDA"};
		for(int name1=0;name1<container4.length;name1++)
		{
			String ref4=container4[name1];
			System.out.println("politicalParties of India:"+ref4);
		}
		System.out.println("ends the method");
	}
}