package Humans.models;

import Humans.services.ReportService;
import Humans.services.SellerService;
import Humans.services.SeniorSellerService;

public class SeniorSeller extends Seller implements SeniorSellerService {
    @Override
    public void closeOperDay() {

    }

    @Override
    public void cancelSellOperation() {

    }
}
