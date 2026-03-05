import java.util.ArrayList;
//----------------------------------------------------------------Electronic Devices Class----------------------------------------------------------------------------------
class ElectronicDevices {

    //Instance Variables
    protected String deviceBrand;
    protected String deviceModel;
    protected String deviceColor;
    protected boolean pluggedIn; //whether the device is plugged in or not
    protected double devicePrice;
    

    //Constructors
    public ElectronicDevices() {
        deviceBrand = "Brand";
        deviceModel = "Model";
        deviceColor = "Color";
        devicePrice = 1000.0; 
        pluggedIn = true;
    }
    public ElectronicDevices(String brand, String model, String color, double price, boolean plugged){
        deviceBrand = brand;
        deviceModel = model;
        deviceColor = color;
        devicePrice = price;
        pluggedIn = plugged;
    }


    //Getters
    public String getBrand(){
        return deviceBrand;
    }
    public String getModel(){
        return deviceModel;
    }
    public String getColor(){
        return deviceColor;
    }
    public double getPrice(){
        return devicePrice;
    }
    public boolean getPluggedInStatus(){
        return pluggedIn;
    }
    

    //Setters
    public void setBrand(String brand){
        deviceBrand = brand;
    }
    public void setModel(String model){
        deviceModel = model;
    }
    public void setColor(String color){
        deviceColor = color;
    }
    public void setPrice(double price){
        devicePrice = price;
    }
    public void setPluggedInStatus(boolean status){
        pluggedIn = status;
    }


    //General Methods
    public void plugInDevice(){
        if (pluggedIn == true){
            System.out.println("Device already plugged in");
        }
        else{
            pluggedIn = true;
        }
    }
    public void unplugDevice(){
        if (pluggedIn == false){
            System.out.println("Device already unplugged");
        }
        else{
            pluggedIn = false;
        }
    }
    @Override
    public String toString(){
        return "Brand: " + deviceBrand +
        "\nModel: " + deviceModel +
        "\nColor: " + deviceColor +
        "\nPrice: " + devicePrice + 
        "\nPlugged in?: " + pluggedIn;
    }

}
//--------------------------------------------------------------------Computer Class----------------------------------------------------------------------------------
class Computer extends ElectronicDevices{

    //Instance Variables
    protected String OS; //Type of operating system
    protected String CPU; //CPU model
    protected int RAM; //How much RAM in computer (GB)


    //Constructors
    public Computer(){
        super();
        OS = "Operating System";
        CPU = "CPU";
        RAM = 32;
    }
    public Computer(String brand, String model, String color, double price, boolean plugged, String OpSystem, String CPU2, int RAM2){
        super(brand, model, color, price, plugged);
        OS = OpSystem;
        CPU = CPU2;
        RAM = RAM2;
    }


    //Getters
    public String getOS(){
        return OS;
    }
    public String getCPU(){
        return CPU;
    }
    public int getRAM(){
        return RAM;
    }


    //Setters
    public void setOS(String OS2){
        OS = OS2;
    }
    public void setCPU(String CPU2){
        CPU = CPU2;
    }
    public void setRAM(int RAM2){
        RAM = RAM2;
    }


    //General Methods
    public void upgradeRAM(int amount){
        if (amount>0){
            RAM += amount;
        }
        else{
            System.out.println("Can't have negative RAM");
        }
    }
    public void resetOS(){
        System.out.println("Operating System has been reset");
    }
    @Override
    public String toString(){
        return super.toString() + "\nOperating System: " + OS +
        "\nCPU: " + CPU +
        "\nRAM: " + RAM;
    }
}
//------------------------------------------------------------------------Laptop Class------------------------------------------------------------------------------------
class Laptop extends Computer{

    //Instance Variables
    protected boolean touchscreen; //Whether the touchscreen is supported on the laptop (true) or not (false)
    protected boolean touchpadStatus; //Whether the touchpad is enabled or not


    //Constructors
    public Laptop(){
        super();
        touchscreen = true;
        touchpadStatus = true;
    }
    public Laptop(String brand, String model, String color, double price, boolean plugged, String OpSystem, String CPU2, int RAM2, boolean touchscreen2, boolean touchpad2){
        super(brand, model, color, price, plugged, OpSystem, CPU2, RAM2);
        touchscreen = touchscreen2;
        touchpadStatus = touchpad2;
    }


    //Getters
    public boolean getTouchscreenStatus(){
        return touchscreen;
    }
    public boolean getTouchpadStatus(){
        return touchpadStatus;
    }


    //Setters
    public void setTouchscreenStatus(boolean touchscreen2){
        touchscreen = touchscreen2;
    }
    public void setTouchpadStatus(boolean touchpad2){
        touchpadStatus = touchpad2;
    }


    //General Methods
    public void enableTouchpad(){
        if (touchpadStatus == true){
            System.out.println("Touchpad already enabled");
        }
        else{
            touchpadStatus = true;
        }
    }
    public void disableTouchpad(){
        if (touchpadStatus == false){
            System.out.println("Touchpad already disabled");
        }
        else{
            touchpadStatus = false;
        }
    }
    @Override
    public String toString(){
        return super.toString() + "\nTouchscreen Enabled?: " + touchscreen +
        "\nTouchpad Enabled?: " + touchpadStatus;
    }

}
//-----------------------------------------------------------------Desktop Class----------------------------------------------------------------------------------------
class Desktop extends Computer{
    
    //Instance Variables
    protected boolean powerStatus; //Whether it is on (true) or off (false)


    //Constructors
    public Desktop(){
        super();
        powerStatus = true;
    }
    public Desktop(String brand, String model, String color, double price, boolean plugged, String OpSystem, String CPU2, int RAM2, boolean power){
        super(brand, model, color, price, plugged, OpSystem, CPU2, RAM2);
        powerStatus = power;
    }

    //Getters
    public boolean getPowerStatus(){
        return powerStatus;
    }


    //Setters
    public void setPowerStatus(boolean status){
        powerStatus = status;
    }


    //General Methods
    public void turnOn(){
        if (powerStatus == true){
            System.out.println("Desktop is already on");
        }
        else{
            powerStatus = true;
        }
    }
    public void turnOff(){
         if (powerStatus == false){
            System.out.println("Desktop is already off");
        }
        else{
            powerStatus = false;
        }
    }
    public void restart(){
        if (powerStatus == false){
            turnOn();
        }
        else{
            turnOff();
            turnOn();
        }
    }
    public void updateSoftware(){
        restart();
        System.out.println("Software successfully updated");
    }
    @Override
    public String toString(){
        return super.toString() + "\nPower Status: " + powerStatus;
    }
}
//------------------------------------------------------------------Server Class-----------------------------------------------------------------------------
class Server extends Computer{

    //Instance Variables
    protected int storageSpace; // in GB
    protected boolean serverCleanliness; //True = clean, False = unclean


    //Constructors
    public Server(){
        super();
        storageSpace = 512;
        serverCleanliness = false;
    }
    public Server(String brand, String model, String color, double price, boolean plugged, String OpSystem, String CPU2, int RAM2, int storage, boolean cleanliness){
        super(brand, model, color, price, plugged, OpSystem, CPU2, RAM2);
        storageSpace = storage;
        serverCleanliness = cleanliness;
    }


    //Getters
    public int getStorageSpace(){
        return storageSpace;
    }
    public boolean getServerCleanliness(){
        return serverCleanliness;
    }


    //Setters
    public void setStorageSpace(int storage){
        storageSpace = storage;
    }
    public void setServerCleanliness(boolean cleanliness){
        serverCleanliness = cleanliness;
    }


    //General Methods
    public void upgradeStorage(int storage){
        storageSpace += storage;
    }
    public void backupData(){
        System.out.println("All data has been backed up");
    }
    public void cleanServer(){
        serverCleanliness = true;
    }
    @Override
    public String toString(){
        return super.toString() + "\nStorage Space: " + storageSpace +
        "\nServer Cleaned?: " + serverCleanliness;
    }
}
//----------------------------------------------------------------Mobile Devices Class-------------------------------------------------------------------------
class MobileDevice extends ElectronicDevices{
    
    //Instance Variables
    protected boolean lockStatus; // true = locked, false = unlocked
    protected int batteryLevel; // in %


    //Constructors
    public MobileDevice(){
        super();
        lockStatus = true;
        batteryLevel = 50;
    }
    public MobileDevice(String brand, String model, String color, double price, boolean plugged, boolean lock, int battery){
        super(brand, model, color, price, plugged);
        lockStatus = lock;
        batteryLevel = battery;
    }


    //Getters
    public boolean getLockStatus(){
        return lockStatus;
    }
    public int getBatteryLevel(){
        return batteryLevel;
    }


    //Setters
    public void setLockStatus(boolean status){
        lockStatus = status;
    }
    public void setBatteryLevel(int battery){
        batteryLevel = battery;
    }


    //General Methods
    public void chargeBattery(int increaseAmount){
        if ((batteryLevel + increaseAmount) > 100){
            batteryLevel = 100;
        }
        else{
            batteryLevel += increaseAmount;
        }
    }
    public void enterPasscode(){
        lockStatus = false;
    }
    @Override
    public String toString(){
        return super.toString() + "\nLock Status: " + lockStatus +
        "\nBattery Level: " + batteryLevel;
    }
}
//--------------------------------------------------------------------Smartphone Class------------------------------------------------------------------------------------
class Smartphone extends MobileDevice{

    //Instance Variables
    protected int phoneVolume; // in %
    protected boolean networkConnection; //True = connected, false = disconnected


    //Constructors
    public Smartphone(){
        super();
        phoneVolume = 50;
        networkConnection = true;
    }
    public Smartphone(String brand, String model, String color, double price, boolean plugged, boolean lock, int battery, int volume, boolean network){
        super(brand, model, color, price, plugged, lock, battery);
        phoneVolume = volume;
        networkConnection = network;
    }


    //Getters
    public int getPhoneVolume(){
        return phoneVolume;
    }
    public boolean getNetworkConnectionStatus(){
        return networkConnection;
    }


    //Setters
    public void setPhoneVolume(int volume){
        phoneVolume = volume;
    }
    public void setNetworkConnectionStatus(boolean status){
        networkConnection = status;
    }


    //General Methods
    public void increaseVolume(int volumeIncrease){
        if ((phoneVolume + volumeIncrease) > 100){
            phoneVolume = 100;
        }
        else{
            phoneVolume += volumeIncrease;
        }
    }
    public void decreaseVolume(int volumeDecrease){
        if ((phoneVolume - volumeDecrease)<0){
            phoneVolume = 0;
        }
        else{
            phoneVolume-=volumeDecrease;
        }
    }
    public void connectToNetwork(){
        if (networkConnection == true){
            System.out.println("Already connected");
        }
        else{
            networkConnection = true;
        }
    }
    public void disconnectFromNetwork(){
        if (networkConnection == false){
            System.out.println("Already disconnected from network");
        }
        else{
            networkConnection = false;
        }
    }
    @Override
    public String toString(){
        return super.toString() + "\nPhone Volume: " + phoneVolume +
        "\nNetwork Connection: " + networkConnection;
    }
}
//----------------------------------------------------------------Tablet Class-------------------------------------------------------------------------------------------
class Tablet extends MobileDevice{

    //Instance Variables
    protected ArrayList <String> appsList;
    protected double screenSize;
    protected boolean stylusSupport; // true = stylus supported, false = stylus not supported


    //Constructors
    public Tablet(){
        super();
        appsList = new ArrayList<>();
        screenSize = 10.0;
        stylusSupport = true;
    }
    public Tablet(String brand, String model, String color, double price, boolean plugged, boolean lock, int battery, int listSize, double screen, boolean stylus){
        super(brand, model, color, price, plugged, lock, battery);
        appsList = new ArrayList<>(listSize);
        screenSize = screen;
        stylusSupport = stylus;
    }


    //Getters
    public ArrayList<String> getAppsList(){
        return appsList;
    }
    public double getScreenSize(){
        return screenSize;
    }
    public boolean getStylusSupportStatus(){
        return stylusSupport;
    }


    //Setters
    public void setAppsList(ArrayList<String> apps){
        appsList = apps;
    }
    public void setScreenSize(double size){
        screenSize = size;
    }
    public void setStylusSupportStatus(boolean status){
        stylusSupport = status;
    }


    //General Methods
    public void sendMessage(String message, String name){
        System.out.println("Your message, \"" + message + "\" has been sent to " + name);
    }
    public void installApp(String app){
        if (appsList.contains(app) == false){
        appsList.add(app);
        System.out.println(app + "has been installed");
        }
        else{
            System.out.println("App has already been installed");
        }
    }
    public void uninstallApp(String app){
        if (appsList.contains(app)){
            appsList.remove(app);
            System.out.println("App has successfully been uninstalled");
        }
        else{
            System.out.println("Specified app is not installed");
        }
    }
    @Override
    public String toString(){
        return super.toString() + "\nApps List: " + appsList +
        "\nScreen Size: " + screenSize +
        "\nStylus Support: " + stylusSupport;
    }
}
//----------------------------------------------------------------E-Reader Class------------------------------------------------------------------------------------
class EReader extends MobileDevice{

    //Instance Variables
    protected String displayType;
    protected int screenBrightness; // in %
    protected ArrayList<String> booksList;


    //Constructors
    public EReader(){
        super();
        displayType = "Display Type";
        screenBrightness = 75;
        booksList = new ArrayList<>();
    }
    public EReader(String brand, String model, String color, double price, boolean plugged, boolean lock, int battery, String display, int brightness, int list){
        super(brand, model, color, price, plugged, lock, battery);
        displayType = display;
        screenBrightness = brightness;
        booksList = new ArrayList<>(list);
    }


    //Getters
    public String getDisplayType(){
        return displayType;
    }
    public int getBrightness(){
        return screenBrightness;
    }
    public ArrayList<String> getBooksList(){
        return booksList;
    }


    //Setters
    public void setDisplayType(String type){
        displayType = type;
    }
    public void setBrightness(int brightness){
        screenBrightness = brightness;
    }
    public void setBooksList(ArrayList<String> list){
        booksList = list;
    }


    //General Methods
    public void increaseBrightness(int amount){
        if ((screenBrightness + amount)>100){
            screenBrightness = 100;
        }
        else{
            screenBrightness += amount;
        }
    }
    public void decreaseBrightness(int amount){
        if ((screenBrightness - amount)<0){
            screenBrightness = 0;
        }
        else{
            screenBrightness-= amount;
        }
    }
    public void downloadBook(String book){
        if (booksList.contains(book) == false){
            booksList.add(book);
        }
        else{
            System.out.println("Book has already been downloaded");
        }
    }
    @Override
    public String toString(){
        return super.toString() + "\nDisplay Type: " + displayType +
        "\nBrightness: " + screenBrightness +
        "\nBooks List: " + booksList;
    }
}
//-------------------------------------------------------------Peripheral Class--------------------------------------------------------------------------------------------------------
class Peripheral extends ElectronicDevices{

    //Instance Variables
    protected String connectionType; //how the device is connected (bluetooth or a type of connector)
    protected boolean isWireless; //true = wireless, false = wired
    protected boolean isConnected; //true = connected, false = not connected


    //Constructors
    public Peripheral(){
        super();
        connectionType = "Connection Type";
        isWireless = true;
        isConnected = true;
    }
    public Peripheral(String brand, String model, String color, double price, boolean plugged, String conType, boolean wireless, boolean connected){
        super(brand, model, color, price, plugged);
        connectionType = conType;
        isWireless = wireless;
        isConnected = connected;
    }


    //Getters
    public String getConnectionType(){
        return connectionType;
    }
    public boolean getWirelessStatus(){
        return isWireless;
    }
    public boolean getConnectionStatus(){
        return isConnected;
    }


    //Setters
    public void setConnectionType(String type){
        connectionType = type;
    }
    public void setWirelessStatus(boolean status){
        isWireless = status;
    }
    public void setConnectionStatus(boolean status){
        isConnected = status;
    }


    //General Methods
    public void connectDevice(){
        if (isConnected == true){
            System.out.println("Device already connected");
        }
        else{
            isConnected = true;
            System.out.println("Device connected");
        }
    }
    public void disconnectDevice(){
        if (isConnected == false){
            System.out.println("Device not connected");
        }
        else{
            isConnected = false;
            System.out.println("Device disconnected");
        }
    }
    @Override
    public String toString(){
        return super.toString() + "\nConnection Type: " + isConnected +
        "\nWireless?: " + isWireless + 
        "\nConnected?: " + isConnected;
    }
}
//------------------------------------------------------------------Keyboard Class------------------------------------------------------------------------------------
class Keyboard extends Peripheral{

    //Instance Variables
    protected int formFactor; // in %
    protected String keyboardLayout; // ex. QWERTY
    protected boolean capsLockStatus; // true = caps lock is on, false = caps lock is off


    //Constructors
    public Keyboard(){
        super();
        formFactor = 100;
        keyboardLayout = "keyboard layout";
        capsLockStatus = false;
    }
    public Keyboard(String brand, String model, String color, double price, boolean plugged, String conType, boolean wireless, boolean connected, int form, String layout, boolean caps){
        super(brand, model, color, price, plugged, conType, wireless, connected);
        formFactor = form;
        keyboardLayout = layout;
        capsLockStatus = caps;
    }


    //Getters
    public int getFormFactor(){
        return formFactor;
    }
    public String getKeyboardLayout(){
        return keyboardLayout;
    }
    public boolean getCapsLockStatus(){
        return capsLockStatus;
    }
    

    //Setters
    public void setFormFactor(int form){
        formFactor = form;
    }
    public void setKeyboardLayout(String layout){
        keyboardLayout = layout;
    }
    public void setCapsLockStatus(boolean status){
        capsLockStatus = status;
    }


    //General Methods
    public void enableCapsLock(){
        if (capsLockStatus == true){
            System.out.println("Caps lock is already enabled");
        }
        else{
            capsLockStatus = true;
        }
    }
    public void disableCapsLock(){
        if (capsLockStatus == false){
            System.out.println("Caps lock is already disabled");
        }
        else{
            capsLockStatus = false;
        }
    }
    @Override
    public String toString(){
        return super.toString() + "\nForm Factor: " + formFactor +
        "\nKeyboard Layout: " + keyboardLayout +
        "\nCaps Lock Status: " + capsLockStatus;
    }
}
//-------------------------------------------------------------------Webcam Class--------------------------------------------------------------------------------------------------
class Webcam extends Peripheral{

    //Instance Variables
    protected String resolution;
    protected int frameRate; //FPS
    protected String lensType;
    protected boolean useStatus; //true = being used by an application, false = not being used by an application


    //Constructors
    public Webcam(){
        super();
        resolution = "resolution";
        frameRate = 60;
        lensType = "lens type";
        useStatus = false;
    }
    public Webcam(String brand, String model, String color, double price, boolean plugged, String conType, boolean wireless, boolean connected, String res, int frame, String lens, boolean used){
        super(brand, model, color, price, plugged, conType, wireless, connected);
        resolution = res;
        frameRate = frame;
        lensType = lens;
        useStatus = used;
    }


    //Getters
    public String getResolution(){
        return resolution;
    }
    public int getFrameRate(){
        return frameRate;
    }
    public String getLensType(){
        return lensType;
    }
    public boolean getUseStatus(){
        return useStatus;
    }


    //Setters
    public void setResolution(String res){
        resolution = res;
    }
    public void setFrameRate(int frame){
        frameRate = frame;
    }
    public void setLensType(String lens){
        lensType = lens;
    }
    public void setUseStatus(boolean used){
        useStatus = used;
    }


    //General Methods
    public void startUsing(){
        if (useStatus == true){
            System.out.println("Webcam is already being used");
        }
        else{
            useStatus = true;
            System.out.println("Webcame is in use");
        }
    }
    public void stopUsing(){
        if (useStatus == false){
            System.out.println("Webcame isn't in use");
        }
        else{
            useStatus = false;
            System.out.println("Webcame is no longer in use");
        }
    }
    @Override
    public String toString(){
        return super.toString() + "\nResolution: " + resolution +
        "\nFrame Rate: " + frameRate +
        "\nLens Type: " + lensType +
        "\nBeing used?: " + useStatus;
    }
}
//------------------------------------------------------------Microphone Class------------------------------------------------------------------------------------
class Microphone extends Peripheral{

    //Instance Variables
    protected int noiseCancellation; //how much noise cancellation is active
    protected String soundPattern;
    protected String microphoneType;
    protected boolean muteStatus; //whether the mic is muted or not (true = muted, false = unmuted)
    protected int micGain; //how much gain the microphone has (%)


    //Constructors
    public Microphone(){
        super();
        noiseCancellation = 20;
        soundPattern = "Sound pattern";
        microphoneType = "mic type";
        muteStatus = true;
        micGain = 30;
    }
    public Microphone(String brand, String model, String color, double price, boolean plugged, String conType, boolean wireless, boolean connected, int noise, String pattern, String type, boolean mute, int gain){
        super(brand, model, color, price, plugged, conType, wireless, connected);
        noiseCancellation = noise;
        soundPattern = pattern;
        microphoneType = type;
        muteStatus = mute;
        micGain = gain;
    }


    //Getters
    public int getNoiseCancellation(){
        return noiseCancellation;
    }
    public String getSoundPattern(){
        return soundPattern;
    }
    public String getMicrophoneType(){
        return microphoneType;
    }
    public boolean getMuteStatus(){
        return muteStatus;
    }
    public int getMicGain(){
        return micGain;
    }


    //Setters
    public void setNoiseCancellation(int noise){
        noiseCancellation = noise;
    }
    public void setSoundPattern(String pattern){
        soundPattern = pattern;
    }
    public void setMicrophoneType(String type){
        microphoneType = type;
    }
    public void setMuteStatus(boolean mute){
        muteStatus = mute;
    }
    public void setMicGain(int gain){
        micGain = gain;
    }


    //General Methods
    public void muteMic(){
        if (muteStatus == true){
            System.out.println("Microphone is already muted");
        }
        else{
            muteStatus = true;
        }
    }
    public void unmuteMic(){
        if (muteStatus == false){
            System.out.println("Mic is already unmuted");
        }
        else{
            muteStatus = false;
        }
    }
    public void increaseGain(int amount){
        if ((micGain + amount)>100){
            micGain = 100;
        }
        else{
            micGain += amount;
        }
    }
    public void decreaseGain(int amount){
        if ((micGain - amount)<0){
            micGain = 0;
        }
        else{
            micGain -= amount;
        }
    }
    @Override
    public String toString(){
        return super.toString() + "\nNoise Cancellation Level: " + noiseCancellation +
        "\nSound Pattern: " + soundPattern +
        "\nMicrophone Type: " + microphoneType +
        "\nMuted?: " + muteStatus +
        "\nMicrophone Gain: " + micGain;
    }
}
public class ElectronicDevicesGKF {
    public static void main(String[] args) {
        
        ElectronicDevices comp = new Computer();
        ElectronicDevices lap = new Laptop();
        ElectronicDevices lap2 = new Laptop("Microsoft", "Surface Laptop 7", "Black", 2000, true, "Windows", "Snapdragon X Elite", 64, true, true);
        ElectronicDevices desk = new Desktop();
        ElectronicDevices serv = new Server();
        ElectronicDevices mobile = new MobileDevice();
        ElectronicDevices phone = new Smartphone();
        ElectronicDevices tab = new Tablet();
        ElectronicDevices reader = new EReader();
        ElectronicDevices periph = new Peripheral();
        ElectronicDevices key = new Keyboard();
        ElectronicDevices web = new Webcam();
        ElectronicDevices mic = new Microphone();

        ArrayList<ElectronicDevices> electronics = new ArrayList<>(13);

        electronics.add(comp);
        electronics.add(lap);
        electronics.add(lap2);
        electronics.add(desk);
        electronics.add(serv);
        electronics.add(mobile);
        electronics.add(phone);
        electronics.add(tab);
        electronics.add(reader);
        electronics.add(periph);
        electronics.add(key);
        electronics.add(web);
        electronics.add(mic);

        ((EReader)reader).downloadBook("To Kill a Mockingbird");
        lap.setBrand("Microsoft");
        key.setColor("White");

        for (int i = 0; i<13; i++){
            System.out.println(electronics.get(i));
            System.out.println("\n ");
        }
    
    }
}