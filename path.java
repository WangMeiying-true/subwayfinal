import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class path {
	 List<station> outList = new ArrayList<station>();//��¼�Ѿ���������վ��
		
		//�����s1վ��s2վ����̾���·��
		public LinkedHashSet<station> calculate(station s1,station s2){
			if(outList.size() == subpath1.totalsat){
				return s1.passedStations(s2);
				}
			if(!outList.contains(s1)){
				outList.add(s1);
			}
			//������վ��OrderSetMapΪ�գ����һ�������վ��ǰ��վ���ʼ��֮
			if(s1.ordersetmap.isEmpty()){
				List<station> Linkedstations = getAllLinkedStations(s1);
				for(station s : Linkedstations){
					s1.passedStations(s).add(s);
				}
			}
			station parent = getShortestPath(s1);//��ȡ�������վs1�����һ��վ���ж���Ļ�������ȡһ����
			if(parent == s2){
				return s1.passedStations(s2);
			}
			for(station child : getAllLinkedStations(parent)){
				if(outList.contains(child)){
					continue;
				}
				int shortestPath = (s1.passedStations(parent).size()-1) + 1;//ǰ�����1��ʾ����·����Ҫȥ������վ�㣬�������1��ʾ������1վ����
				if(s1.passedStations(child).contains(child)){
					//���s1�Ѿ����������child�ľ������룬��ô�Ƚϳ���С�ľ���
					if((s1.passedStations(child).size()-1) > shortestPath){
						//����S1����Χ��վ����С·��
						s1.passedStations(child).clear();
						s1.passedStations(child).addAll(s1.passedStations(parent));
						s1.passedStations(child).add(child);
					}
				} else {
					//���s1��û�м��������child�ľ�������
					s1.passedStations(child).addAll(s1.passedStations(parent));
					s1.passedStations(child).add(child);
				}
			}
			outList.add(parent);
			return calculate(s1,s2);
		}
		
		//ȡ����station������վ����̾��룬���1վ������Ϊ1����������
	   station getShortestPath(station station){
			int minPatn = Integer.MAX_VALUE;
			station rets = null;
			for(station s :station.ordersetmap.keySet()){
				if(outList.contains(s)){
					continue;
				}
				LinkedHashSet<station> set  = station.passedStations(s);//����station��s������������վ��ļ���
				if(set.size() < minPatn){
					minPatn = set.size();
					rets = s;
				}
			}
			return rets;
		}
		
		//��ȡ����stationֱ������������վ�����������������վ
		 List<station> getAllLinkedStations(station station){
			List<station> linkedStaions = new ArrayList<station>();
			for(List<station> line : subpath1.lineset){
				if(line.contains(station)){//���ĳһ���߰����˴�վ��ע��������д��hashcode������ֻ��name��ͬ������Ϊ��ͬһ������
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
