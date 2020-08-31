package docComments;

/**
 * Creates a camera with the make, megapixels and weight
 * Creates a unique ID for the device
 * @author Kerry Regan and Kenyon Gentry
 *
 */
public class Cameras {
	private String make;
	private int megapixels;
	private int weight;
	final private int id;	//should be int or string?
	private static int count = 0;
	/**
	 * Constructor that initializes the fields
	 * @param make
	 * @param megapixels
	 * @param weight
	 */
	public Cameras(String make, int megapixels, int weight) {
		this.make = make;
		this.megapixels = megapixels;
		this.weight = weight;
		this.id = 1111111 + count++;	//I dont think this is right, but we can fix it later
	}
	/**
	 * Returns the make of the cameras
	 * @return the make
	 */
	public String getMake() {
		return make;
	}
	/**
	 * Returns the megapixels of the cameras
	 * @return the megapixels
	 */
	public int getMegapixels() {
		return megapixels;
	}
	/**
	 * Returns the weight of the cameras
	 * @return the weight
	 */
	public int getWeight() {
		return weight;
	}
	/**
	 * Returns the unique ID of the cameras
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	@Override
	public String toString() {
		return "Cameras [make=" + make + ", megapixels=" + megapixels + ", weight=" + weight + ", id=" + id + "]";
	}
	
	
	
}
