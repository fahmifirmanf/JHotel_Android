package id.ac.ui.jhotel_android_fahmiff;

/**
 * Created by Hamba Elektronika on 03/05/2018.
 */

public class Room {
    private String roomNumber;
    private String statusKamar;
    private String tipeKamar;
    private double dailyTariff;

    /*
    public Room(String tipeKamar, String roomNumber, String statusKamar, double dailyTariff )
    {
        this.tipeKamar = tipeKamar;
        this.roomNumber = roomNumber;
        this.statusKamar = statusKamar;
        this.dailyTariff = dailyTariff;
    }
    */
    public Room(String roomNumber, String statusKamar, double dailyTariff, String tipeKamar) {
        this.roomNumber = roomNumber;
        this.statusKamar = statusKamar;
        this.dailyTariff = dailyTariff;
        this.tipeKamar = tipeKamar;
    }

    public String getRoomNumber()
    {
        return roomNumber;

    }

    public String getStatusKamar()
    {
        return statusKamar;
    }

    public String getTipeKamar()
    {
        return tipeKamar;
    }

    public double getDailyTariff()

    {
        return dailyTariff;
    }

    public void SetRoomNumber(String roomNumber){
        this.roomNumber = roomNumber;
    }
    public void SetStatusKamar(String statusKamar){
        this.statusKamar = statusKamar;
    }
    public void SetTipeKamar(String tipeKamar){
        this.tipeKamar = tipeKamar;
    }
    public void SetDailyTariff(double dailyTariff){
        this.dailyTariff = dailyTariff;
    }

}
