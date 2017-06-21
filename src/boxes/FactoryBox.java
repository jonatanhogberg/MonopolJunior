package boxes;

import java.util.HashMap;

public class FactoryBox {
	private HashMap<Integer, Box> hmap;
	
	public FactoryBox() {
		hmap = new HashMap<Integer, Box>();
		init();
	}
	
	public Box getBox(int position) {
		return hmap.get(position);
	}
	
	private void init() {
		 hmap.put(1, new RestBox("Go"));
		 hmap.put(2, new EntertainmentBox(1, "Ballongstånd"));
		 hmap.put(3, new EntertainmentBox(1, "Sockervaddstånd"));
		 hmap.put(4, new ChanceBox());
		 hmap.put(5, new TrainBox("Gula Linjens järnväg"));
		 hmap.put(6, new EntertainmentBox(2, "Dockteater"));
		 hmap.put(7, new EntertainmentBox(2, "Trollerishow"));
		 hmap.put(8, new ShowBox("Fyrverkeriet"));
		 hmap.put(9, new RestBox("Vilohytt"));
		 hmap.put(10, new ChanceBox());
		 hmap.put(11, new EntertainmentBox(2, "Karusell"));
		 hmap.put(12, new EntertainmentBox(2, "Trampbåtar"));
		 hmap.put(13, new TrainBox("Gröna Linjens järnväg"));
		 hmap.put(14, new EntertainmentBox(3, "Vattenrutschbana"));
		 hmap.put(15, new EntertainmentBox(3, "Minigolf"));
		 hmap.put(16, new ChanceBox());
		 hmap.put(17, new OnkelKrosusBox());
		 hmap.put(18, new EntertainmentBox(3, "Spelhall"));
		 hmap.put(19, new EntertainmentBox(3, "Lustiga Huset"));
		 hmap.put(20, new ChanceBox());
		 hmap.put(21, new TrainBox("Blå Linjens järnväg"));
		 hmap.put(22, new EntertainmentBox(4, "Helikoptertur"));
		 hmap.put(23, new EntertainmentBox(4, "Ponnyridning"));
		 hmap.put(24, new ShowBox("Vattenshowen"));
		 hmap.put(25, new GoToRestBox());
		 hmap.put(26, new ChanceBox());
		 hmap.put(27, new EntertainmentBox(4, "Radiobilar"));
		 hmap.put(28, new EntertainmentBox(4, "Lyckohjul"));
		 hmap.put(29, new TrainBox("Röda Linjens järnväg"));
		 hmap.put(30, new EntertainmentBox(5, "Loopen"));
		 hmap.put(31, new EntertainmentBox(5, "Berg och dalbana"));
		 hmap.put(32, new ChanceBox());
	}
}
