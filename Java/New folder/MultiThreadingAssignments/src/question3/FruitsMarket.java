package question3;

public class FruitsMarket {
int apple;
int grape;
int orange;
int watermelon;
public synchronized int getApple() {
	return apple;
}
public synchronized void setApple(int apple) {
	this.apple = apple;
}
public synchronized int getGrape() {
	return grape;
}
public synchronized void setGrape(int grape) {
	this.grape = grape;
}
public synchronized int getOrange() {
	return orange;
}
public synchronized void setOrange(int orange) {
	this.orange = orange;
}
public synchronized int getWatermelon() {
	return watermelon;
}
public synchronized void setWatermelon(int watermelon) {
	this.watermelon = watermelon;
}


}
