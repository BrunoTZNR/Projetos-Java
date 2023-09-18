package modal.services;

import modal.entitites.Contract;

public class ContractService {
	private OnlinePaymentService onlinePaymentService;
	
	public ContractService() {
	}
	
	public ContractService(OnlinePaymentService onlinePaymentService) {
		this.onlinePaymentService = onlinePaymentService;
	}

	public OnlinePaymentService getOnlinePaymentSerice() {
		return onlinePaymentService;
	}

	public void setOnlinePaymentSerice(OnlinePaymentService onlinePaymentService) {
		this.onlinePaymentService = onlinePaymentService;
	}

	public void processContract(Contract contract, Integer months) {
		
	}
}
