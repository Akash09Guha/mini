package mini;

public class ComplaintDetails {

@Override
	public String toString() {
		return "ComplaintDetails [dateReceived=" + dateReceived + ", product=" + product + ", subProduct=" + subProduct
				+ ", issue=" + issue + ", subIssue=" + subIssue + ", company=" + company + ", state=" + state
				+ ", ZIPcode=" + ZIPcode + ", submittedVia=" + submittedVia + ", dateSentToCompany=" + dateSentToCompany
				+ ", companyResponseToConsumer=" + companyResponseToConsumer + ", timelyResponse=" + timelyResponse
				+ ", consumerDisputed=" + consumerDisputed + ", companyId=" + companyId + "]";
	}
private String dateReceived;
private String product;
private String subProduct;
private String issue;
private String subIssue;
private String company;
private String state;
private String ZIPcode;
private String submittedVia;
private String dateSentToCompany;
private String companyResponseToConsumer;
private String timelyResponse;
private String consumerDisputed;
private String companyId;

public String getDateReceived() {
	return dateReceived;
}
public void setDateReceived(String dateReceived) {
	this.dateReceived = dateReceived;
}
public String getProduct() {
	return product;
}
public void setProduct(String product) {
	this.product = product;
}
public String getSubProduct() {
	return subProduct;
}
public void setSubProduct(String subProduct) {
	this.subProduct = subProduct;
}
public String getIssue() {
	return issue;
}
public void setIssue(String issue) {
	this.issue = issue;
}
public String getSubIssue() {
	return subIssue;
}
public void setSubIssue(String subIssue) {
	this.subIssue = subIssue;
}
public String getCompany() {
	return company;
}
public void setCompany(String company) {
	this.company = company;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
public String getZIPcode() {
	return ZIPcode;
}
public void setZIPcode(String zIPcode) {
	ZIPcode = zIPcode;
}
public String getSubmittedVia() {
	return submittedVia;
}
public void setSubmittedVia(String submittedVia) {
	this.submittedVia = submittedVia;
}
public String getDateSentToCompany() {
	return dateSentToCompany;
}
public void setDateSentToCompany(String dateSentToCompany) {
	this.dateSentToCompany = dateSentToCompany;
}
public String getCompanyResponseToConsumer() {
	return companyResponseToConsumer;
}
public void setCompanyResponseToConsumer(String companyResponseToConsumer) {
	this.companyResponseToConsumer = companyResponseToConsumer;
}
public String getTimelyResponse() {
	return timelyResponse;
}
public void setTimelyResponse(String timelyResponse) {
	this.timelyResponse = timelyResponse;
}
public String getConsumerDisputed() {
	return consumerDisputed;
}
public void setConsumerDisputed(String consumerDisputed) {
	this.consumerDisputed = consumerDisputed;
}
public String getCompanyId() {
	return companyId;
}
public void setCompanyId(String companyId) {
	this.companyId = companyId;
}

}