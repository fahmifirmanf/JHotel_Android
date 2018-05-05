package id.ac.ui.jhotel_android_fahmiff;

/**
 * Created by Hamba Elektronika on 03/05/2018.
 */

public class Room {
    private String roomNumber;
    private String statusKamar;
    private String tipeKamar;
    private double dailyTariff;

    public Room(String statusKamar, String tipeKamar, double roomNumber, String dailyTariff) {
        this.roomNumber = roomNumber;
        this.statusKamar = statusKamar;
        this.roomNumber = roomNumber;
        this.dailyTariff = dailyTariff;

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
