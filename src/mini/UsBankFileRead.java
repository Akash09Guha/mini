package mini;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class UsBankFileRead {

ArrayList<ComplaintDetails> complaintDetails=new  ArrayList<ComplaintDetails>();
public void fileLoader() {

// ArrayList<String> objcompdetOfBanks=new ArrayList<>();
 String path="C:\\Users\\Sanmay\\Downloads\\complaints.csv";
 
 String line="";
 
 try {
	BufferedReader bf=new BufferedReader(new FileReader(path));
	while ((line=bf.readLine())!=null)
	{   
		
		
		String[] elements=line.split(",");
		ComplaintDetails objcompdet=new ComplaintDetails();
		objcompdet.setDateReceived(elements[0]);
		objcompdet.setProduct(elements[1]);
		objcompdet.setSubProduct(elements[2]);
		objcompdet.setIssue(elements[3]);
		objcompdet.setSubIssue(elements[4]);
		objcompdet.setCompany(elements[5]);
		objcompdet.setState(elements[6]);
		objcompdet.setZIPcode(elements[7]);
		objcompdet.setSubmittedVia(elements[8]);
		objcompdet.setDateSentToCompany(elements[9]);
		objcompdet.setCompanyResponseToConsumer(elements[10]);
		objcompdet.setTimelyResponse(elements[11]);
		objcompdet.setConsumerDisputed(elements[12]);
		objcompdet.setCompanyId(elements[13].replaceAll(" ", ""));

		complaintDetails.add(objcompdet);
		
	}
	bf.close();
	
} catch (FileNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
 
 
}

ArrayList<ComplaintDetails> GetMapBankobjcompdet(){
	
	return complaintDetails;
	
}
}
