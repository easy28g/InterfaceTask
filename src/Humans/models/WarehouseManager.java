package Humans.models;

import Humans.services.ReportService;
import Humans.services.WarehouseService;
import Humans.services.WriteOffService;

public class WarehouseManager extends Person implements ReportService, WarehouseService, WriteOffService {
    @Override
    public void report() {

    }

    @Override
    public void writeoff() {

    }

    @Override
    public void createProduct() {

    }

    @Override
    public void deleteProduct() {

    }

    @Override
    public void acceptProduct() {

    }
}
