package Interface;

public class NiceCar {

		private Engine engine;
		private MediaPlayer player = new  Media();
		
		public NiceCar() {
			engine = new PowerEngine();
		}
		
		public NiceCar(Engine engine) {
			this.engine = engine;
		}
		
		public void start() {
			engine.start();
		}
		
		public void startmusic () {
			player.start();
		}
		
		public void Stopmusic() {
			player.stop();
		}
		
		public void upgradeEngine() {
			this.engine = new ElectricEngine();
		}
		
}
