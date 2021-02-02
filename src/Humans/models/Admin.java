package Humans.models;

import Humans.services.AdminService;
import Humans.services.ReportService;
import Humans.services.SeniorSellerService;
import Humans.services.WriteOffService;

public class Admin extends Person implements SeniorSellerService, ReportService, AdminService, WriteOffService {

    @Override
    public void closeOperDay() {

    }

    @Override
    public void cancelSellOperation() {

    }

    @Override
    public void orderProduct() {

    }

    @Override
    public void crateAccount() {

    }

    @Override
    public void deleteAccount() {

    }

    @Override
    public void report() {

    }

    @Override
    public void writeoff() {

    }
}
