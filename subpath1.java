
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.io.*;

public class subpath1 {
	public static List<station> l1=new ArrayList<station>();
	public static List<station> l2=new ArrayList<station>();
	public static List<station> l3=new ArrayList<station>();
	public static List<station> l10=new ArrayList<station>();
	public static List<station> ls1=new ArrayList<station>();
	public static List<station> ls8=new ArrayList<station>();
	public static List<station> l4=new ArrayList<station>();
	public static List<station> ls3=new ArrayList<station>();
	public static List<station> ls9=new ArrayList<station>();
	public static List<station> ls7=new ArrayList<station>();
    public static Set<List<station>> lineset=new HashSet<List<station>>();
    public static int totalsat=0;
    public static void main(String[] args)throws IOException {
    	int k =0;
    	try{for(;k<args.length;k++) {
    		if(args[k].equals("-map")) {
    			File filename=new File(args[k+1]);
    	    	InputStreamReader reader=new InputStreamReader(new FileInputStream(filename));
    	        BufferedReader br=new BufferedReader(reader);
    	        //1号线
    	        br.readLine();
    	        String l1str=br.readLine();
    	        String[] l1arr=l1str.split("，");
    	        for(String s : l1arr){
    				if(s.indexOf("#")!=-1) {
    					s=s.substring(0, s.indexOf("#"));
    				}
    				l1.add(new station(s));
    			}
    	        for(int i=0;i<l1.size();i++) {
    	        	if(i<(l1.size()-1)) {
    	        		l1.get(i).next=l1.get(i+1);
    	        		l1.get(i+1).prev=l1.get(i);
    	        	}
    	        }
    	        //2号线
    	        br.readLine();
    	        String l2str=br.readLine();
    	        String[] l2arr=l2str.split("，");
    	        for(String s: l2arr) {
    	        	if(s.indexOf("#")!=-1) {
    					s=s.substring(0, s.indexOf("#"));
    				}
    	        	l2.add(new station(s));
    	        }
    	        	
    	        for(int i=0;i<l2.size();i++) {
    	        	if(i<(l2.size()-1)) {
    	        		l2.get(i).next=l2.get(i+1);
    	        		l2.get(i+1).prev=l2.get(i);
    	        	}
    	        }
    	        //line3
    	        br.readLine();
    	        String l3str=br.readLine();
    	        String[] l3arr=l3str.split("，");
    	        for(String s: l3arr) {
    	        	if(s.indexOf("#")!=-1) {
    					s=s.substring(0, s.indexOf("#"));
    				}
    	        	l3.add(new station(s));
    	        }
    	        	
    	        for(int i=0;i<l3.size();i++) {
    	        	if(i<(l3.size()-1)) {
    	        		l3.get(i).next=l3.get(i+1);
    	        		l3.get(i+1).prev=l3.get(i);
    	        		
    	        	}
    	        }
    	        //line 10
    	        br.readLine();
    	        String l10str=br.readLine();
    	        String[] l10arr=l10str.split("，");
    	        for(String s: l10arr) {
    	        	if(s.indexOf("#")!=-1) {
    					s=s.substring(0, s.indexOf("#"));
    				}
    	        	l10.add(new station(s));
    	        }
    	        	
    	        for(int i=0;i<l10.size();i++) {
    	        	if(i<(l10.size()-1)) {
    	        		l10.get(i).next=l10.get(i+1);
    	        		l10.get(i+1).prev=l10.get(i);
    	        	}
    	        }
    	        //line s1
    	        br.readLine();
    	        String ls1str=br.readLine();
    	        String[] ls1arr=ls1str.split("，");
    	        for(String s: ls1arr) {
    	        	if(s.indexOf("#")!=-1) {
    					s=s.substring(0, s.indexOf("#"));
    				}
    	        	    ls1.add(new station(s));
    	        }
    	        	
    	        for(int i=0;i<ls1.size();i++) {
    	        	if(i<(ls1.size()-1)) {
    	        		ls1.get(i).next=ls1.get(i+1);
    	        		ls1.get(i+1).prev=ls1.get(i);
    	        	}
    	        }
    	        //line s8
    	        br.readLine();
    	        String ls8str=br.readLine();
    	        String[] ls8arr=ls8str.split("，");
    	        for(String s: ls8arr) {
    	        	if(s.indexOf("#")!=-1) {
    					s=s.substring(0, s.indexOf("#"));
    				}
    	        	ls8.add(new station(s));
    	        }
    	        	
    	        for(int i=0;i<ls8.size();i++) {
    	        	if(i<(ls8.size()-1)) {
    	        		ls8.get(i).next=ls8.get(i+1);
    	        		ls8.get(i+1).prev=ls8.get(i);
    	        	}
    	        }
    	        //line 4
    	        br.readLine();
    	        String l4str=br.readLine();
    	        String[] l4arr=l4str.split("，");
    	        for(String s: l4arr) {
    	        	if(s.indexOf("#")!=-1) {
    					s=s.substring(0, s.indexOf("#"));
    				}
    	        	l4.add(new station(s));
    	        }
    	        	
    	        for(int i=0;i<l4.size();i++) {
    	        	if(i<(l4.size()-1)) {
    	        		l4.get(i).next=l4.get(i+1);
    	        		l4.get(i+1).prev=l4.get(i);
    	        	}
    	        }
    	        //line s3
    	        br.readLine();
    	        String ls3str=br.readLine();
    	        String[] ls3arr=ls3str.split("，");
    	        for(String s: ls3arr) {
    	        	if(s.indexOf("#")!=-1) {
    					s=s.substring(0, s.indexOf("#"));
    				}
    	        	ls3.add(new station(s));
    	        }
    	        	
    	        for(int i=0;i<ls3.size();i++) {
    	        	if(i<(ls3.size()-1)) {
    	        		ls3.get(i).next=ls3.get(i+1);
    	        		ls3.get(i+1).prev=ls3.get(i);
    	        		//System.out.print(ls3.get(i).next.name);
    	        	}
    	        	
    	        }
    	        //line s9
    	        br.readLine();
    	        String ls9str=br.readLine();
    	        String[] ls9arr=ls9str.split("，");
    	        for(String s: ls9arr) {
    	        	if(s.indexOf("#")!=-1) {
    					s=s.substring(0, s.indexOf("#"));
    				}
    	        	ls9.add(new station(s));
    	        }
    	        	
    	        for(int i=0;i<ls9.size();i++) {
    	        	if(i<(ls9.size()-1)) {
    	        		ls9.get(i).next=ls9.get(i+1);
    	        		ls9.get(i+1).prev=ls9.get(i);
    	        	}
    	        }
    	        //line s7
    	        br.readLine();
    	        String ls7str=br.readLine();
    	        String[] ls7arr=ls7str.split("，");
    	        for(String s: ls7arr) {
    	        	if(s.indexOf("#")!=-1) {
    					s=s.substring(0, s.indexOf("#"));
    				}
    	        	ls7.add(new station(s));
    	        }
    	        	
    	        for(int i=0;i<ls7.size();i++) {
    	        	if(i<(ls7.size()-1)) {
    	        		ls7.get(i).next=ls7.get(i+1);
    	        		ls7.get(i+1).prev=ls7.get(i);
    	        	}
    	        }
    	        br.close();
    	        lineset.add(l1);
    	        lineset.add(l2);
    	        lineset.add(l3);
    	        lineset.add(l10);
    	        lineset.add(ls1);
    	        lineset.add(ls8);
    	        lineset.add(l4);
    	        lineset.add(ls3);
    	        lineset.add(ls9);
    	        lineset.add(ls7);
    	        totalsat=l1.size()+l2.size()+l3.size()+l10.size()+ls1.size()+ls8.size()+l4.size()+ls3.size()+ls9.size()+ls7.size();
    	    System.out.println("获得地图成功");
    	    break;
    		}//获得地图
    	}//for循环
    	}catch (IOException e) {
    		System.out.println("文件输入错误，读取文件失败");
    	}
    	if(k==args.length) {System.out.println("map参数匹配失败");
    	return;}
    	else {
    	//特定线路的站：
    	int i=0;
    	for(;i<args.length;i++) {
    		
    		//需求二
    		if(args[i].equals("-a")) {
    			int w=0;
    			for(;w<args.length;w++) {
    				if(args[w].equals("-o")) {
	    				File writeName=new File(args[w+1]);
	    				writeName.createNewFile();
	    				FileWriter writer=new FileWriter(writeName);
	    				BufferedWriter out=new BufferedWriter(writer);
	    				if(args[i+1].equals("1号线")) {
	    					 System.out.println("查找线路成功");
	    					out.write("1号线："+"\r\n");
	    					for(station node:l1) {
	    						out.write(node.name+"\r\n");
	    					}
	    					out.flush();
		    				out.close();
	    				}
	    				else	
	    				if(args[i+1].equals("2号线")) {
	    					 System.out.println("查找线路成功");
	    					out.write("2号线："+"\r\n");
	    					for(station node:l2) {
	    						out.write(node.name+"\r\n");
	    					}
	    					out.flush();
		    				out.close();
	    				}
	    				else	
	    				if(args[i+1].equals("3号线")) {
	    					 System.out.println("查找线路成功");
    						out.write("3号线："+"\r\n");
	    					for(station node:l3) {
	    						out.write(node.name+"\r\n");
	    					}
	    					out.flush();
		    				out.close();
	    				}
	    				else
	    				if(args[i+1].equals("10号线")) {
	    					 System.out.println("查找线路成功");
    						out.write("10号线："+"\r\n");
	    					for(station node:l10) {
	    						out.write(node.name+"\r\n");
	    					}
	    					out.flush();
		    				out.close();
	    				}
	    				else
	    				if(args[i+1].equals("s1号线")) {
	    					 System.out.println("查找线路成功");
    						out.write("s1号线："+"\r\n");
	    					for(station node:ls1) {
	    						out.write(node.name+"\r\n");
	    					}
	    					out.flush();
		    				out.close();
	    				}
	    				else
	    				if(args[i+1].equals("s8号线")) {
	    					 System.out.println("查找线路成功");
    						out.write("s8号线："+"\r\n");
	    					for(station node:ls8) {
	    						out.write(node.name+"\r\n");
	    					}
	    					out.flush();
		    				out.close();
	    				}
	    				else
	    				if(args[i+1].equals("4号线")) {
	    					 System.out.println("查找线路成功");
    						out.write("4号线："+"\r\n");
	    					for(station node:l4) {
	    						out.write(node.name+"\r\n");
	    					}
	    					out.flush();
		    				out.close();
	    				}
	    				else
	    				if(args[i+1].equals("s3号线")) {
	    					 System.out.println("查找线路成功");
    						out.write("s3号线："+"\r\n");
	    					for(station node:ls3) {
	    						out.write(node.name+"\r\n");
	    					}
	    					out.flush();
		    				out.close();
	    				}else
	    					if(args[i+1].equals("s9号线")) {
	    						 System.out.println("查找线路成功");
	    						out.write("s9号线："+"\r\n");
	    						for(station node:ls9) {
		    						out.write(node.name+"\r\n");
		    					}
	    						out.flush();
	    	    				out.close();
	    					}
	    					else
	    					if(args[i+1].equals("s7号线")) {
	    						 System.out.println("查找线路成功");
	    						out.write("s7号线："+"\r\n");
	    						for(station node:ls7) {
		    						out.write(node.name+"\r\n");
		    					}
	    						out.flush();
	    	    				out.close();
	    					}
	    					else {
	    						System.out.println("此线未开通");
	    					}
	    				break;
	    			}
    				
    			}
    			if(w==args.length) {
    				System.out.println("输出参数错误1");
    				return;
    			}
    		       break;
    		}
    		
    		//需求三
    		if(args[i].equals("-b")) {
    			path th=new path();
    			LinkedHashSet<station> l=th.calculate(new station(args[i+1]), new station(args[i+2]));
    			int w=0;
    			for(;w<args.length;w++) {
	    			try{if(args[w].equals("-o")) {
	    				File writeName=new File(args[w+1]);
	    				writeName.createNewFile();
	    				FileWriter writer=new FileWriter(writeName);
	    				BufferedWriter out=new BufferedWriter(writer);
	    				out.write(String.valueOf(l.size())+"\r\n");
	    				station[] ss=new station[l.size()];
	        			int kk=0;
	        			for(station point:l) 
	        				ss[kk++]=point;
	        			out.write(ss[0].name+"\r\n");
	        			for(int i1=1;i1<kk-1;i1++) {
	        				out.write(ss[i1].name+"\r\n");
	        				if(!th.lineno(ss[i1], ss[i1+1]).equals(th.lineno(ss[i1-1], ss[i1]))) {
	        					out.write(th.lineno(ss[i1], ss[i1+1])+"\r\n");
	        				}
	        			}
	        			out.write(ss[kk-1].name);
	    				out.flush();
	    				out.close();
	    				break;
	    			}
	    			}	catch(IOException e) {
	    				 e.printStackTrace();
	    				
	    			}
	    		}
    			if(w==args.length) {
    				System.out.println("输出参数错误2");
    				return;
    			}
    		System.out.println("搜索路径成功");
    		break;
    		}	
    	}
    	if(i==args.length) {
    		System.out.println("需求参数错误或未输入");
    		return;
    	}
    	}	
    }
}
