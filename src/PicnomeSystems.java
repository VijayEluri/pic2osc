import java.util.*;interface PicnomeSystems {  String APP_VERSION = "1.4.11";  int MAX_CONNECTABLE_NUM = 2;  String getFirmwareVersion();  void changeDeviceSettings(int index);  boolean openSerialPort(int index);  boolean closeSerialPort(int index);  boolean setSerialPort(int index);  void initOSCPort(int index);  void setOSCHostInfo();  void initOSCListener();  void openMIDIPort(int index);  void setCurrentMidiIn(int index, int id);  void setCurrentMidiOut(int index, int id);  Vector<String> getMidiInputList();  Vector<String> getMidiOutputList();  int getCurrentMidiIn(int index);  int getCurrentMidiOut(int index);  int getMidiNoteChannel(int nx, int ny);  int getMidiNoteOnVelocity(int nx, int ny);  int getMidiNoteOffVelocity(int nx, int ny);  void setMidiNoteChannel(int nx, int ny, int ch);  void setMidiNoteOnVelocity(int nx, int ny, int vel);  void setMidiNoteOffVelocity(int nx, int ny, int vel);  Vector<String> getDeviceList();  int getCurrentNum();  String getCurrentDevice(int index);  void setCurrentProtocol(int index, String name);  void setCurrentCable(int index, String orientation);  void setCurrentStartingColumn(int index, int column);  void setCurrentStartingRow(int index, int row);  int getCurrentMaxColumn(int index);  int getCurrentIntensity(int index);  void setCurrentIntensity(int index, int value);  void setAdcEnable(int index0, int index1, boolean b);  boolean checkPortState(int index);  void sendDataToSerial(int index, int data);  void sendDataToSerial(int index, String str);  void sendDataToSerial(int index, String[] str);}