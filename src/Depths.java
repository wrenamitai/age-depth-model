
public class Depths {
	double [][] depth;
	
	public Depths(int cores) {
		this.depth = new double[cores][2];
		for (int i = 0; i < cores; i++) {
			depth[i][0] = i;
		}
		depth[0][1] = 156.5;
		depth[1][1] = 166;
		depth[2][1] = 175.5;
		depth[3][1] = 185;
		depth[4][1] = 194.5;
		depth[5][1] = 204;
		depth[6][1] = 213.5;
		depth[7][1] = 223;
		depth[8][1] = 232.5;
		depth[9][1] = 242;
		depth[10][1] = 251.5;
		depth[11][1] = 261;
		depth[12][1] = 270.5;
		depth[13][1] = 280;
		depth[14][1] = 289.5;
		depth[15][1] = 299;
		depth[16][1] = 308.5; ///note that this core is weird, with a section 6 of size .7
		depth[17][1] = 318;
		depth[18][1] = 327.5;
		depth[19][1] = 337;
		depth[20][1] = 346.5;
		depth[21][1] = 355.5;
	}
	
	public double getDepth(int core) {
		return depth[core-1][1];
	}
	
}
