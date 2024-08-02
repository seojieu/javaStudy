package test240729.object1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

public class LotteryController {
	private HashSet lottery = new HashSet();
	private HashSet win = new HashSet();
	
	public boolean insertObject(Lottery l) {
		return lottery.add(l);
	}
	
	public boolean deleteObject(Lottery l) {
		return lottery.remove(l);
	}
	
	public HashSet winObject() {
		//당첨자 4명을 뽑기위한 반복 4번
		for(int i = 0; i < 4; i++) {
			return null;
		}
		
		List<Lottery> list = new ArrayList<>();
		list.addAll(lottery);
		while(win.size() < 4) {
			int rand = (int)(Math.random() * list.size());
			win.add(list.get(rand));
			}
		return win;
			}
	
	public TreeSet sortedWinObject() {
		TreeSet sortedWinSet = new TreeSet(new SortedLottery());
		sortedWinSet.addAll(win);
		return sortedWinSet;
	}
	
	public boolean searchWinner(Lottery l ) {
		return win.contains(l);
		
	}
}
