package pack1;

public class PaieInfo {
	String paie_id;
	String account_id;
	String amount;
	String date_time;
	String paie_transact;
	
	public String getPaie_transact() {
		return paie_transact;
	}
	public String getPaie_id() {
		return paie_id;
	}
	public String getAccount_id() {
		return account_id;
	}
	public String getAmount() {
		return amount;
	}
	public String getDate_time() {
		return date_time;
	}
	
	
	public PaieInfo(String paie_id,String account_id,String amount,String date_time,String paie_transact){
		this.paie_id = paie_id;
		this.account_id = account_id;
		this.amount = amount;
		this.date_time = date_time;
		this.paie_transact = paie_transact;
	}

}
