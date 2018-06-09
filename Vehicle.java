public abstract class Vehicle implements Travel,Owner{

	}
	class Car extends Vehicle{

		@Override
		public int getSpeed() {
			return 0;
		}

		@Override
		public String getOwnerName() {
			return null;
		}
		
	}
	class Bike extends Vehicle{

		@Override
		public int getSpeed() {
			return 0;
		}

		@Override
		public String getOwnerName() {
			return null;
		}
	}
	class Train extends Vehicle{

		@Override
		public int getSpeed() {
			return 0;
		}
