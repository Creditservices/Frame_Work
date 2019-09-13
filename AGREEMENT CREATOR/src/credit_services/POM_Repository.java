package credit_services;

import org.openqa.selenium.By;

public class POM_Repository {
   
	//Front office Login
	static By UsernameFO = By.name("username");
	static By PasswordFO = By.name("password");
	static By SubmitFO = By.xpath("//a[@id='PanLinkSubmit']");
	
	//Front Office Agreement Search
	static By FO_Lnk_NewProposal = By.xpath("//span[@id='bannermenu']/a[2]");
	static By FO_AgreementNumber = By.name("agreementNumber");
	static By FO_SubmitAgreement = By.xpath("//a[@id='PanLinkSubmit_0']");
	static By FO_Agreementstatus =By.xpath("//div[@id='main']/div[2]/div[1]/div[2]/div[1]/table/tbody/tr[2]/td[2]");
	static By FO_AgreementLink =By.xpath("//a[@class='linkWithBullet']");
	
	//Front office approve Action
	static By FO_Approvebutton =By.linkText("Accept Proposal");
	static By FO_Clickapprovebutton =By.linkText("Approve");
	static By FO_Agrapprovestatus =By.xpath("//*[@id='PanForm']/div[2]/div/span[1]/span");
	
	//Front Office Logout
	static By FO_Logout_Button = By.xpath("//a[@id='PanDirectLink_434']");
	
	//Front office servicing
	//Course details action
	static By FO_Clickcoursedetailslink=By.xpath("//div[@id='main']/form/div[2]/div[2]/div[2]/table/tbody/tr/td[2]/table/tbody/tr[7]/td[2]/a");
	static By FO_Getidentifier=By.xpath("//div[@id='main']/div[2]/div[1]/div[1]/table/tbody/tr[2]/td[1]");
	static By FO_Getreference=By.xpath("//div[@id='main']/div[2]/div[1]/div[1]/table/tbody/tr[2]/td[2]");
	static By FO_Getagrnumber=By.xpath("//div[@id='main']/div[2]/div[1]/div[1]/table/tbody/tr[2]/td[4]");
	static By FO_GetStartdate=By.xpath("//div[@id='main']/div[2]/div[1]/div[1]/table/tbody/tr[2]/td[5]");
	static By FO_GetEnddate=By.xpath("//div[@id='main']/div[2]/div[1]/div[1]/table/tbody/tr[2]/td[6]");
	static By FO_GetCost=By.xpath("//div[@id='main']/div[2]/div[1]/div[1]/table/tbody/tr[2]/td[7]");
	static By FO_detailstable=By.xpath("//div[@id='main']/div[2]/div[1]/div[2]/table/tbody/tr/td");
	static By FO_CoursedetailsClosebutton=By.linkText("Close");
	
	//Front office servicing
	//Change of Due date
	static By FO_Paymentdatelink=By.xpath("//div[@id='main']/form/div[2]/div[2]/div[2]/table/tbody/tr/td[2]/table/tbody/tr[1]/td[2]/a");
	static By FO_Duedatetype=By.xpath("//select[@id='dueDateId']");
	static By FO_Newnextpaymentdate=By.xpath("//input[@id='newNextPaymentDate']");
	static By FO_Paymentdatesave=By.xpath("//a[@id='PanLinkSubmit']");
	static By FO_Errormsg=By.xpath("//div[@id='main']/div[2]/div/div/table/tbody/tr[2]/td");
	static By FO_Errormsgback=By.linkText("Back");
	
	//Front office servicing
	//View schedules action 
	static By FO_Viewscheduleslink=By.xpath("//div[@id='main']/form/div[2]/div[2]/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td[1]/a");
	static By FO_Viewschedulefirstrow=By.xpath("//div[@id='main']/div[2]/div[1]/div[1]/table/tbody/tr[2]/td[1]");
	static By FO_Viewschedulesecondrow=By.xpath("//div[@id='main']/div[2]/div[1]/div[1]/table/tbody/tr[3]/td[1]");
	static By FO_Viewschedulethirdrow=By.xpath("//div[@id='main']/div[2]/div[1]/div[1]/table/tbody/tr[4]/td[1]");
	static By FO_Viewschedulestype=By.xpath("//div[@id='main']/div[2]/div[1]/div[1]/table/tbody/tr[2]/td[1]");
	static By FO_Viewschedulesnoofpay=By.xpath("//div[@id='main']/div[2]/div[1]/div[1]/table/tbody/tr[2]/td[2]");
	static By FO_Viewschedulesterms=By.xpath("//div[@id='main']/div[2]/div[1]/div[1]/table/tbody/tr[2]/td[3]");
	static By FO_Viewschedulesstatus=By.xpath("//div[@id='main']/div[2]/div[1]/div[1]/table/tbody/tr[2]/td[4]");
	static By FO_Viewschedulesstartdate=By.xpath("//div[@id='main']/div[2]/div[1]/div[1]/table/tbody/tr[2]/td[5]");
	static By FO_Viewschedulesenddate=By.xpath("//div[@id='main']/div[2]/div[1]/div[1]/table/tbody/tr[2]/td[6]");
	static By FO_ViewschedulesDuedate=By.xpath("//div[@id='main']/div[2]/div[1]/div[2]/table/tbody/tr[2]/td[1]");
	static By FO_Viewschedulesinsamnt=By.xpath("//div[@id='main']/div[2]/div[1]/div[2]/table/tbody/tr[2]/td[2]");
	static By FO_closebutton=By.linkText("Close");
	
	//Front office servicing
	//withdrawal notification
	static By FO_Withdrawalnotificlink=By.xpath("//div[@id='main']/form/div[2]/div[2]/div[2]/table/tbody/tr/td[2]/table/tbody/tr[9]/td[2]/a");
	static By FO_Withdrawalnotificdate=By.name("withdrawalNotificationDate");
	static By FO_Withdrawalnotificsave=By.linkText("Save");
	static By FO_Withdrawalnotificblock=By.xpath("//*[@id='PanForm']/div[2]/div[2]/div[2]/table/tbody/tr/td[1]/table/tbody/tr[14]/td[4]");
	static By FO_Withdrawalnotificproporate=By.xpath("//*[@id='PanForm']/div[2]/div[2]/div[2]/table/tbody/tr/td[1]/table/tbody/tr[15]/td[4]");
	
	//Front office servicing
	//Agreement history
	static By FO_Agreementmorelink=By.linkText("More...");
	static By FO_Commontypeevent=By.xpath("//*[@id='main']/div[2]/div[1]/div[1]/table/tbody/tr[2]/td[4]");
	static By FO_Withdraweve1=By.xpath("//div[@id='main']/div[2]/div[1]/div[1]/table/tbody/tr[3]/td[4]");
	static By FO_Withdraweve1value=By.xpath("//div[@id='main']/div[2]/div[1]/div[1]/table/tbody/tr[3]/td[5]");
	static By FO_Withdraweve2=By.xpath("//div[@id='main']/div[2]/div[1]/div[1]/table/tbody/tr[2]/td[4]");
	static By FO_Withdraweve2value=By.xpath("//div[@id='main']/div[2]/div[1]/div[1]/table/tbody/tr[2]/td[5]");
	static By FO_Withdrweve1=By.xpath("//div[@id='main']/div[2]/div[1]/div[1]/table/tbody/tr[20]/td[4]");
	static By FO_Withdrweve1value=By.xpath("//div[@id='main']/div[2]/div[1]/div[1]/table/tbody/tr[20]/td[5]");
	static By FO_Withdrweve2=By.xpath("//div[@id='main']/div[2]/div[1]/div[1]/table/tbody/tr[19]/td[4]");
	static By FO_Withdrweve2value=By.xpath("//div[@id='main']/div[2]/div[1]/div[1]/table/tbody/tr[19]/td[5]");

	//***IKANO***
	//Esignature elements
	static By IK_Chk_ESign=By.id("secciSigned");
	static By IK_Btn_Proceed=By.xpath("//*[@id='ProceedButton']/span");
	static By IK_Chk_AgrSign=By.id("agreementSigned");
	static By IK_Chk_WarrantySign=By.id("warrantySigned");
	static By IK_Btn_Submit=By.id("SubmitButton");
	static By IK_Btn_Next=By.xpath("//*[@id='main_content']/div[5]/div[2]/a/span");
	static By IK_Btn_Confirm=By.xpath("//*[@id='main_content']/div[2]/div[2]/a/span");
	
	//*****OPEN UNIVERSITY*****
	//Student portal login
	static By OU_Studentportal_continuebutton=By.linkText("Continue");
	static By OU_Studentportal_Password=By.name("password");
	static By OU_Studentportal_Confirmpaswd=By.name("password2");
	static By OU_Studentportal_submitlogin=By.name("login");
	
	//Student portal actions
	//Personal details page
	static By OU_Studentporatl_continueapplicationbutton=By.name("continueApplication");
	
	//Address details page
	static By OU_Studentporatl_UKaddresslink=By.linkText("Enter UK Address");
	static By OU_Studentportal_Propertynumber=By.name("propertyNumber");
	static By OU_Studentportal_Postcode=By.name("postcode");
	static By OU_Studentportal_Searchbutton=By.name("search");
	static By OU_Studentportal_Addressnotfounlink=By.linkText("Address not found");
	static By OU_Studentportal_Addresspostcode=By.name("addressDetails.postcode");
	static By OU_Studentportal_Addressflatnum=By.name("addressDetails.flat");
	static By OU_Studentportal_Addresspropertynum=By.name("addressDetails.propertyNumber");
	static By OU_Studentportal_Addresspropertyname=By.name("addressDetails.propertyName");
	static By OU_Studentportal_Addressstreetname=By.name("addressDetails.streetName");
	static By OU_Studentportal_Addressdistrict=By.name("addressDetails.district");
	static By OU_Studentportal_Addresspostaltown=By.name("addressDetails.postalTown");
	static By OU_Studentportal_Addressflatcounty=By.name("addressDetails.county");
	static By OU_Studentportal_Addressday=By.name("day");
	static By OU_Studentportal_Addressmonth=By.name("month");
	static By OU_Studentportal_AddressYear=By.name("year");
	static By OU_Studentportal_Continuebutton=By.name("continue");
	static By OU_Studentportal_Continuelink=By.linkText("Continue");
	
	//Financial page
	static By OU_Studentportal_Checkbox=By.name("consentToSearch");
	static By OU_Studentportal_Empoccupancy=By.name("person.occupancyID");
	static By OU_Studentportal_Empstatus=By.name("person.employmentStatusID");
	static By OU_Studentportal_Emppaymethod=By.name("agreement.paymentMethodID");
	//Income
	static By OU_Studentportal_Annualincome=By.name("annualIncome");
	static By OU_Studentportal_Monthlyincome=By.name("monthlyIncome");
	static By OU_Studentportal_Dividend=By.name("dividendsReceived");
	static By OU_Studentportal_Benefit=By.name("benefitsReceived");
	static By OU_Studentportal_Rent=By.name("rentReceived");
	static By OU_Studentportal_Maintenance=By.name("maintenanceReceived");
	static By OU_Studentportal_Totalincome=By.name("totalMonthlyIncome");
	//Expenditure
	static By OU_Studentportal_Creditcard=By.name("creditCards");
	static By OU_Studentportal_Loans=By.name("loans");
	static By OU_Studentportal_Counciltax=By.name("councilTax");
	static By OU_Studentportal_Utilities=By.name("utilities");
	static By OU_Studentportal_Mortgage=By.name("mortgage");
	static By OU_Studentportal_Noofdependants=By.name("numberOfDependants");
	static By OU_Studentportal_Noofadults=By.name("numberOfAdults");
	static By OU_Studentportal_Savebutton=By.name("save");
	//Employment details
	static By OU_Studentportal_Employeename=By.name("employment.employerName");
	static By OU_Studentportal_Employeetelephone=By.name("employment.telephone");
	static By OU_Studentportal_Employeepropertynumber=By.name("address.propertyNumber");
	static By OU_Studentportal_Employeestreetname=By.name("address.streetName");
	static By OU_Studentportal_Employeedistrict=By.name("address.district");
	static By OU_Studentportal_Employeeposttown=By.name("address.postalTown");
	static By OU_Studentportal_Employeepostcode=By.name("address.postcode");
	static By OU_Studentportal_Employeecounty=By.name("address.county");
	static By OU_Studentportal_Employeecountry=By.name("address.countryID");
	static By OU_Studentportal_Employeeyear=By.name("yearsWith");
	static By OU_Studentportal_Employeemonth=By.name("monthsWith");
	static By OU_Studentportal_Employeeoccupation=By.name("employment.occupation");
	static By OU_Studentportal_Employeepositionid=By.name("employment.positionID");
	static By OU_Studentportal_Employeesectorid=By.name("employment.sectorID");
	static By OU_Studentportal_Employeesave=By.name("save");
	
	//Direct Debit
	static By OU_Studentportal_Banksortcode=By.name("bankAccount.sortCode");
	static By OU_Studentportal_Search=By.name("search");
	static By OU_Studentportal_Banknamelink=By.linkText("BARCLAYS BANK PLC");
	static By OU_Studentportal_Banknamelink1=By.linkText("Halifax");
	static By OU_Studentportal_Bankaccountname=By.name("bankAccount.accountName");
	static By OU_Studentportal_Bankaccountnumber=By.name("bankAccount.accountNumber");
	static By OU_Studentportal_Onesignature=By.name("oneSignature");
	static By OU_Studentportal_Directdebitsave=By.name("save");
	static By OU_Studentportal_Directdebitcontinue=By.linkText("Continue");
	static By OU_Studentportal_DDconitue=By.linkText("Continue");
	static By OU_Studentportal_DDContinuewithapplink=By.linkText("Continue with application");
	static By OU_Studentportal_OuStudentstatus=By.xpath("//*[@id='ou-content']/h1");
	static By OU_Studentportal_finishbutton=By.linkText("Finish");
	static By OU_Student_Checkbox =By.name("consented");
	static By OU_Student_Accept =By.id("accepted-save_save");
	
	//OU staff portal login
	static By OU_Staffcontinuelink =By.linkText("Continue");
	static By OU_Usernamestaff =By.name("username");
	static By OU_Passwordstaff =By.name("password");
	static By OU_Submitlogin=By.name("login");
	
	//OU Staff Portal
	static By OU_Staff_Pinumber =By.name("piNumber");
	static By OU_Staff_Seacrhbutton=By.name("search");
	static By OU_Staff_PIdetails=By.xpath("//*[@id='ou-content']/table/tbody/tr/td[1]/a");
	static By OU_Staff_Agrstatus=By.xpath("//*[@id='ou-content']/table/tbody/tr/td[5]");
	static By OU_Staff_Agreementlink=By.xpath("//*[@id='ou-content']/table/tbody/tr/td[1]/a");
	static By OU_Staff_Continueapplicationbutton=By.name("continueApplication");
	static By OU_Staff_Checkbox =By.name("consented");
	static By OU_Staff_Save=By.name("save");
	static By OU_Staff_logout=By.linkText("Log out");
	static By OU_Staffportal_finishbutton=By.linkText("Finish");
	
	//********ELL*******
	//Queue Proposal
	static By EL_Queue_proposal = By.xpath("//*[@href='/edlBranch/app?component=%24PanDirectLink_18&page=NewBusiness%2FNBSummary&service=direct&session=T&sp=SNewBusiness%2FNBQueueProposal&sp=S100072']");
	static By EL_Work_queue = By.xpath("//*[@id='plan']");
	static By EL_Retain_queue = By.xpath("//*[@id='retainPlan']");
	static By EL_queue = By.xpath("//*[@id='PanLinkSubmit_0']");
	
	//Loan options
	static By EL_Loanoption = By.linkText("Loan Options");
	static By EL_Newoption = By.xpath("//div[@class='submitButtons']/a[3]");
	static By EL_Product = By.xpath("//*[@id='productID']");
	static By EL_cashtocustomer = By.xpath("//input[@id='cashToCustomer']");
	static By EL_Rate = By.xpath("//*[@id='rateMarginHeaderIDList']");
	static By EL_Term = By.xpath("//input[@id='term']");
	static By EL_Recalculate = By.xpath("//*[@id='PanLinkSubmit_4']");
	static By EL_Btn_Save = By.xpath("//a[text()='Save']");
	static By EL_Btn_Takeup = By.xpath("//a[@href='/edlBranch/app?component=%24PanDirectLink_0&page=NewBusiness%2FNBLoanOptions&service=direct&session=T&state:NewBusiness/NBLoanOptions=ZH4sIAAAAAAAAAFvzloG1XIiBgYGZgYE7ubSoKDWvJCAxPbW4iEEwK7EsUS8nMS9dzzOvJDU9tUjo0YIl3xvbLZgYGD0ZWMsSc0pTK4oYBBDq%2FEpzk1KL2tZMleWe8qCbiYGhogBoNCPIAn6Y4fnFmSWZ%2BXnFhQx1DGBQzs%2FAwINktRFcihEAznnhCp4AAAA%3D']");
	
	//Approve loan
	static By EL_Approve_loan = By.xpath("//a[@href='/edlBranch/app?component=%24PanDirectLink_18&page=NewBusiness%2FNBSummary&service=direct&session=T&sp=SNewBusiness%2FNBAcceptProposal&sp=S100061']");
	static By EL_Btn_Approve = By.xpath("//a[text()='Approve']");
	
	//Payout and Activate
	static By EL_payoutButton = By.xpath("//a[@href='/edlBranch/app?component=%24PanDirectLink_18&page=NewBusiness%2FNBSummary&service=direct&session=T&sp=SNewBusiness%2FNBPayoutAndActivate&sp=S100067']");
	static By EL_Payment_method = By.xpath("//*[@id='paymentMethod']");
	static By EL_Btn_Activate = By.xpath("//a[text()='Activate']");
	static By EL_ActivationSuccessMsg = By.xpath("//*[@id='main']/div[2]/div[1]/div/div[2]");
	
	//********Telefonica*******
	static By TUK_Chk_Secci = By.id("secciSigned");
	static By TUK_Btn_Proceed = By.id("ProceedButton");
	static By TUK_Chk_AgrSign = By.id("agreementSigned");
	static By TUK_Btn_Submit = By.id("SubmitButton");
	static By TUK_Btn_Next = By.linkText("Next");
	static By TUK_Btn_Continue = By.linkText("Continue");
	static By TUK_FinalMsg = By.xpath("//h1[text()='This site can’t be reached']");
	
	//********Startline*******
	static By SL_Lnk_MotorProposal = By.linkText("Motor Proposal");
	static By SL_Edt_AgrNum = By.name("agreementNumber");
	static By SL_Lnk_SearchAgr = By.linkText("Search");
	static By SL_Lnk_AgrNum = By.xpath("//*[@id='custSearchBody']/table[1]/tbody/tr[2]/td[1]/a");
	static By SL_Btn_Refresh = By.xpath("//*[@id='panelBody']/form/table[4]/tbody/tr[2]/td/div/a[1]");
	static By SL_Elm_status = By.xpath("//*[@id='panelBody']/form/table[1]/tbody/tr[1]/td[2]");
	static By SL_Elm_Financials = By.xpath("//h1[text()='Financials']");
	static By SL_Btn_Continue = By.linkText("Continue");
	static By SL_Btn_ManualOverride = By.linkText("Manual Override");
	static By SL_Btn_PayoutGolive = By.linkText("Payout & Golive");
	static By SL_Elm_Advance = By.xpath("//*[@id='panelBody']/form/table[1]/tbody/tr[5]/td[2]");
	static By SL_Elm_Installment = By.xpath("//*[@id='panelBody']/form/table[1]/tbody/tr[6]/td[4]");
	static By SL_Btn_DocsReceived = By.linkText("Docs Received");
	static By SL_Btn_Yes = By.xpath("//*[@id='sitebody']/div[5]/div[3]/div/button[1]/span");
	static By SL_Btn_Yes1 = By.xpath("//span[text()='Yes']");
	static By SL_Edt_Advance = By.name("documentAdvance");
	static By SL_Edt_Installment = By.name("documentInstalment");
	static By SL_Edt_Balloon = By.name("documentBalloon");
	static By SL_Edt_DocFee = By.name("documentDocumentFee");
	static By SL_Btn_1stCheck = By.linkText("1st Check Validated");
	static By SL_Btn_ConfSpecTerms = By.linkText("Confirm Special Terms");
	static By SL_Btn_DocsApproved = By.linkText("Docs Approved");
	static By SL_Lst_Brand = By.name("changeBrandID");
	static By SL_Btn_Back = By.xpath("//a[@class='backButton']");
	
}
