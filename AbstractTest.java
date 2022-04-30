public class AbstractTest {
	public static void main(String[] args) {
		// Instrument i = new Instrument();
		// MusicalInstrument i = new MusicalInstrument();
//		StringBasedMusicalInstrument i = new StringBasedMusicalInstrument();
		Guitar g=new Guitar();
		g.utilize();
		g.play();
		g.tuneStrings();
		g.pluck();
		Violin V = new Violin();
		V.play();
		V.tuneStrings();
		V.utilize();
	}
}

	abstract class Instrument {
		abstract void utilize();
	}

	abstract class MusicalInstrument extends Instrument {
		abstract void play();
	}

	abstract class StringBasedMusicalInstrument extends MusicalInstrument {
		abstract void tuneStrings();
	}

	class Guitar extends StringBasedMusicalInstrument {

		@Override
		void tuneStrings() {
			System.out.println("Tuning the Guitar strings");
		}

		@Override
		void play() {
			System.out.println("Playing the guitar...");
		}

		@Override
		void utilize() {
			System.out.println("Utilizing the guitar....");
		}

		void pluck() {
			System.out.println("Plucking the guitar....");
		}
	}

	class Violin extends StringBasedMusicalInstrument {

		@Override
		void tuneStrings() {
			System.out.println("Tuning the Violin Strings...");
			// TODO Auto-generated method stub

		}

		@Override
		void play() {
			System.out.println("Playing the Violin...");
			// TODO Auto-generated method stub

		}

		@Override
		void utilize() {
			System.out.println("Utilizing the Violin...");
			// TODO Auto-generated method stub

		}
	}
