package docComments;

/**
 * Creates a camera with the make, megapixels and weight
 * Creates a unique ID for the device
 * @author Kerry Regan and Kenyon Gentry
 *
 */
public class Camera {
	private String make;
	private int megapixels;
	private int weight;
	final private int id;	
	final private int seed = 1111111;
	private static int count = 0;
	/**
	 * Constructor that initializes the fields
	 * @param make
	 * @param megapixels
	 * @param weight
	 */
	public Camera(String make, int megapixels, int weight) {
		this.make = make;
		this.megapixels = megapixels;
		this.weight = weight;
		this.id = seed + count++;
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
		return "id: " + id + "\n" + make + " " + megapixels + " megapixels" + " " + weight + " lbs";
	}
}
