package com.oop.fundemantals.coupling.cohesion;

class DownloadAndStores{
    void downloadFromInternet() {
        //http
    }
    void parseData() {
        //Jsoup
    }
    void storeIntoDatabase() {
        //Jdbc
    }
    void doEverything() {
        downloadFromInternet();
        parseData();
        storeIntoDatabase();

    }
}
public class BadCohesion {

}
