package Arrays;

import java.util.*;

public class Practice {

	static class Cell {
		int x;
		int y;
		int time;

		public Cell(int x, int y, int time) {
			this.x = x;
			this.y = y;
			this.time = time;
		}
	}

	static boolean isValid(int x, int y, int n, int m) {
		if (x >= 0 && x < n && y < m && y >= 0)
			return true;
		return false;
	}
	
	public static int delivery(List<List<Integer>> area) {
		int maxt = 0;
		
		int dx[] = { 1, -1, 0, 0 };
		int dy[] = { 0, 0, 1, -1 };
		ArrayList<Cell> q = new ArrayList<Cell>();
		boolean visited[][] = new boolean[area.size()][area.get(0).size()];
		visited[0][0] = true;
		q.add(new Cell(0,0,0));
		
		while (!q.isEmpty()) {
			Cell t = q.remove(0);
			maxt = t.time;
			for (int i = 0; i < 4; i++) {
				int x = t.x + dx[i];
				int y = t.y + dy[i];
				if (isValid(x, y, area.size(), area.get(0).size()) && !visited[x][y] && area.get(x).get(y) != 0) {
					if(area.get(x).get(y) == 9) return maxt + 1;
					visited[x][y] = true;
					q.add(new Cell(x, y, t.time + 1));
				}
			}
		}	
		return -1;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<List<Integer>> l = new ArrayList<>();
		l.add(Arrays.asList(1,1,1,1));
		l.add(Arrays.asList(0,1,1,1));
		l.add(Arrays.asList(0,1,0,1));
		l.add(Arrays.asList(1,1,9,1));
		l.add(Arrays.asList(0,0,1,1));
		System.out.println(delivery(l));

	}

}
