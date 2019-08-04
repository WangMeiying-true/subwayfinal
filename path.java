import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class path {
	 List<station> outList = new ArrayList<station>();//记录已经分析过的站点
		
		//计算从s1站到s2站的最短经过路径
		public LinkedHashSet<station> calculate(station s1,station s2){
			if(outList.size() == subpath1.totalsat){
				return s1.passedStations(s2);
				}
			if(!outList.contains(s1)){
				outList.add(s1);
			}
			//如果起点站的OrderSetMap为空，则第一次用起点站的前后站点初始化之
			if(s1.ordersetmap.isEmpty()){
				List<station> Linkedstations = getAllLinkedStations(s1);
				for(station s : Linkedstations){
					s1.passedStations(s).add(s);
				}
			}
			station parent = getShortestPath(s1);//获取距离起点站s1最近的一个站（有多个的话，随意取一个）
			if(parent == s2){
				return s1.passedStations(s2);
			}
			for(station child : getAllLinkedStations(parent)){
				if(outList.contains(child)){
					continue;
				}
				int shortestPath = (s1.passedStations(parent).size()-1) + 1;//前面这个1表示计算路径需要去除自身站点，后面这个1表示增加了1站距离
				if(s1.passedStations(child).contains(child)){
					//如果s1已经计算过到此child的经过距离，那么比较出最小的距离
					if((s1.passedStations(child).size()-1) > shortestPath){
						//重置S1到周围各站的最小路径
						s1.passedStations(child).clear();
						s1.passedStations(child).addAll(s1.passedStations(parent));
						s1.passedStations(child).add(child);
					}
				} else {
					//如果s1还没有计算过到此child的经过距离
					s1.passedStations(child).addAll(s1.passedStations(parent));
					s1.passedStations(child).add(child);
				}
			}
			outList.add(parent);
			return calculate(s1,s2);
		}
		
		//取参数station到各个站的最短距离，相隔1站，距离为1，依次类推
	   station getShortestPath(station station){
			int minPatn = Integer.MAX_VALUE;
			station rets = null;
			for(station s :station.ordersetmap.keySet()){
				if(outList.contains(s)){
					continue;
				}
				LinkedHashSet<station> set  = station.passedStations(s);//参数station到s所经过的所有站点的集合
				if(set.size() < minPatn){
					minPatn = set.size();
					rets = s;
				}
			}
			return rets;
		}
		
		//获取参数station直接相连的所有站，包括交叉线上面的站
		 List<station> getAllLinkedStations(station station){
			List<station> linkedStaions = new ArrayList<station>();
			for(List<station> line : subpath1.lineset){
				if(line.contains(station)){//如果某一条线包含了此站，注意由于重写了hashcode方法，只有name相同，即认为是同一个对象
					station s = line.get(line.indexOf(station));
					if(s.prev != null){
						linkedStaions.add(s.prev);
					}
					if(s.next != null){
						linkedStaions.add(s.next);
					}
				}
			}
			return linkedStaions;
		}
		String lineno(station s1,station s2) {
			if(subpath1.l1.contains(s1)&&subpath1.l1.contains(s2))
				return "1";
			if(subpath1.l2.contains(s1)&&subpath1.l2.contains(s2))
				return "2";
			if(subpath1.l3.contains(s1)&&subpath1.l3.contains(s2))
				return "3";
			if(subpath1.l10.contains(s1)&&subpath1.l10.contains(s2))
				return "10";
			if(subpath1.ls1.contains(s1)&&subpath1.ls1.contains(s2))
				return "s1";
			if(subpath1.ls8.contains(s1)&&subpath1.ls8.contains(s2))
				return "s8";
			if(subpath1.l4.contains(s1)&&subpath1.l4.contains(s2))
				return "4";
			if(subpath1.ls3.contains(s1)&&subpath1.ls3.contains(s2))
				return "s3";
			if(subpath1.ls9.contains(s1)&&subpath1.ls9.contains(s2))
				return "s9";
			if(subpath1.ls7.contains(s1)&&subpath1.ls7.contains(s2))
				return "s7";
			return null;
		}
	 
}
