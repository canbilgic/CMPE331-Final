// Bus.java is get and set method for buses in our project. 


public class Bus {
	// strings for bus names, images and day
	String[] name = {"Bus1","Bus2","Bus3","Bus4","Bus5","Bus6","Bus7","Bus8","Bus9","Bus10"};
	String[] img = {"img1.jpg","img2.jpg","img3.jpg","img4.jpg","img5.jpg","img6.jpg","img7.jpg","img8.jpg","img9.jpg","img10.jpg",};
	String[] day = {"Monday","Tuesday","Wednessday","Thursady","Friday","Saturday","Sunday"};
  
  // get and set method for name, day and images for buses.
  public String getName(int i) {
		return name[i];
	}

	public void setName(String[] name) {
		this.name = name;
	}

	public String getDay(int i) {
		return day[i];
	}

	public void setDay(String[] day) {
		this.day = day;
	}

	public String getImg(int i) {
		return img[i];
	}

	public void setImg(String[] img) {
		this.img = img;
	}
}
