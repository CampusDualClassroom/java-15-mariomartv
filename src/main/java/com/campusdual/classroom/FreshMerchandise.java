package com.campusdual.classroom;

import java.text.SimpleDateFormat;
import java.util.Date;

public class FreshMerchandise extends Merchandise {

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    Date expirationDate = new Date();

    public String getFormattedDate(Date date) {
        SimpleDateFormat fechaSimple= new SimpleDateFormat("dd-MM-YYYY");
        formattedDate=fechaSimple.format(date);
        return formattedDate;
    }

    public void setFormattedDate(String formattedDate) {
        this.formattedDate = formattedDate;
    }


    String formattedDate=new String();


    public FreshMerchandise(String name, String uniqueId, String responsibleId, int zone, String area, String shelf, int quantity, Date expirationDate) {
        super(name, uniqueId, responsibleId, zone, area, shelf, quantity);
        this.expirationDate = expirationDate;
    }

    @Override
    public Object getSpecificData() {
        SimpleDateFormat fechaSimple = new SimpleDateFormat("dd-MM-YYYY");
        String fecha=fechaSimple.format(this.expirationDate);
        return "La localizacion es: "+this.getLocation()+". Y la caducidad es: "+fecha;
    }

    public void printSpecificData(){

        System.out.println(getSpecificData());
    }


}
