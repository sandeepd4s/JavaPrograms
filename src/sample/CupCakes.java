package sample;

import java.util.ArrayList;

public class CupCakes {

	static int n = 0, c = 0, m = 0, wrapperCount = 0, exchangeCount = 0, count = 0;

	public static void maxCupCkaes(ArrayList<String> trips) {
		ArrayList<Integer> vals = new ArrayList<Integer>();
		for (String trip : trips) {
			String[] t = trip.split(" ");
			//Add the retreived values to array list object
			for (String val : t) {
				vals.add(Integer.parseInt(val));
			}
			//Retreive the retreived values to array list object
			if (vals.size() > 2) {
				n = vals.get(0);
				c = vals.get(1);
				m = vals.get(2);
			// Logic 
				count = n / c;
				wrapperCount = count;
				while (wrapperCount >= m) {
					exchangeCount = wrapperCount / m;
					count = exchangeCount + count;
					wrapperCount = exchangeCount + (wrapperCount % m);
				}
				System.out.println(count);
			}
			//Assign Empty ArrayList<Integer> object to earlier created refrence.
			//This is only linw which i missed
			vals = new ArrayList<>();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> trips = new ArrayList<String>();
		trips.add("3 ");
		trips.add("10 2 5");
		trips.add("12 4 4");
		trips.add("6 2 2");

		maxCupCkaes(trips);

	}

}
