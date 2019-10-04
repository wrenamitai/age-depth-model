
public class AgeConstants {
	double[][] constants;
	
	public AgeConstants() {
		this.constants = new double[13][3];
		constants[0][0] = 156.5;
		constants[1][0] = 175.5;	
		constants[2][0] = 188;
		constants[3][0] = 204.5;
		constants[4][0] = 226.4; 
		constants[5][0] = 237;
		constants[6][0] = 242.2;
		constants[7][0] = 252;
		constants[8][0] = 267;
		constants[9][0] = 270;
		constants[10][0] = 283;
		constants[11][0] = 292;
		constants[12][0] = 302.5;
		constants[0][1] = 18.203; //load sedimentation rate (m)
		constants[1][1] = 11.66;
		constants[2][1] = 16.616;
		constants[3][1] = 19.312;
		constants[4][1] = 19.308;
		constants[5][1] = 12.093;
		constants[6][1] = 12.039;
		constants[7][1] = 9.622;
		constants[8][1] = 9.622;
		constants[9][1] = 8.502;
		constants[10][1] = 8.507;
		constants[11][1] = 8.314;
		constants[12][1] = 13.135;
		constants[0][2] = -6.234; //load y intercept
		constants[1][2] = 59.082;
		constants[2][2] = 4.29;
		constants[3][2] = -28.192;
		constants[4][2] = -28.135;
		constants[5][2] = 58.87;
		constants[6][2] = 59.684;
		constants[7][2] = 98.305;
		constants[8][2] = 98.305;
		constants[9][2] = 106.926;
		constants[10][2] = 106.836;
		constants[11][2] = 111.039;
		constants[12][2] = 0;
	}
	public double getSedRate(double depth) {
		int i;
		for (i = 1; i < 13 && depth >= this.constants[i][0]; i++) {
		}
		return this.constants[i-1][1]; 
	}
	public double getYIntercept(double depth) {
		int i;
		for (i = 1; i < 13 && depth >= this.constants[i][0] && i < 13; i++) {
		}
		return this.constants[i-1][2]; 
	}
	
}
