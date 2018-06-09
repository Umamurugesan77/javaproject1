public abstract class Animal implements Travel,Owner{
		

	}
	class Cat extends Animal{

		@Override
		public int getSpeed() {
			return 0;
		}

		@Override
		public String getOwnerName() {
			return null;
		}
		
	}
	class Monkey extends Animal{

		@Override
		public int getSpeed() {
			return 0;
		}

		@Override
		public String getOwnerName() {
			return null;
		}
		
	}
	class Donkey extends Animal{

		@Override
		public int getSpeed() {
			return 0;
		}
