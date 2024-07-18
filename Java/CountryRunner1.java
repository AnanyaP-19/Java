class CountryRunner1
{
	public static void main(String[] args)
	{
		System.out.println("running in main mathod");
		String[] states={"Andra Prades","Arunachal Pradesh","Assam","Bihar","Chhattisgarh","Goa","Gujarat","Haryana",
		"Himachal Pradesh","Jharkhand","Karnataka","Kerala","Madya Pradesh","Maharashtra","Manipur","Meghalaya","Mizoram",
		"Nagaland","Odisha","Punjab","Rajastan","Sikkim","Tamil Nadu","Telangana","Tripura","Uttar Pradesh",
		"Jammu and Kashmir","Uttarkand","West Bengal"};
		Country.statesNames("states");
		int[] states1={577227,577429,580007,577419,580118,581103,581121,581129,581186,581187};
		Country.pincode(577227);
		String[] states2={"Narendra Modi","Manmohan Singh","Atal Bihari Vajpayee","Inder Kumar gujral","H.D.Deve Gowda",
		"P.V.Narasimha Rao","Chandra Shekar","V.P.Singh","Rajiv gandhi","Indira gandhi","Charah Singh","Morarji Desai",
		"Gulzarilal nanda","Lal Bahadur Shastri","Jawaharlal Nehru"};
		Country.primeMinister("states2");
		String[] states3={"Shri Rajnath Singh","Shri Amith Shah","Shri Nitin Jairam Gaakari","Smt. Nirmala Siharaman",
		"Shri Shivraj Singh Chauhan","Dr. Surahmanyam Jaishankar","Shri Jagat Prakash nadda","Shri manohar lal",
		"Shri H.D. Kumarswamy","Shri Piyush Goyal","Shri Dharmendra Pradan","Shri Jitin Ram Manjhi","Shri Rajiv ranjan Singh",
		"Shri Sarbananda Sonowal","Dr Virendra Kumar","Shri Kinjarap Rammahan Naidu","Shri Pralhad Jashi","Shri Julal Oram",
		"Shri Giriraj Singh","Shri Chirag paswan","Shri C R PAtil","Shri G.Kishan Reddy","Dr.Manusukh Mandaviya",
		"Shri Hardeep Singh Puri","Shri Kiren Rijiju","Smt.Annpurna Devi","Shri Gajendra Singh Shekhawat","Shri Bhupendra yadav",
		"Shri Jyotiraditya M.Scindia","Shri Ashwini Vaishnaw"};
		Country.cabinetMinister("states3");
		String[] states4={"BJP","Congress","JDS","Prajakiya","NDA"};
		Country.politicalParty("states4");
	}
}
