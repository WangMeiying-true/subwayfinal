import java.io.IOException;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class subpath1Test {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void testMain() throws IOException {
		new subpath1();
		String[ ] ss= {"-map","subway.txt","-a","1号线","-o","lineno1.txt"};
		subpath1.main(ss);
		String[] ss1= {"-map","subway.txt","-a","2号线","-o","lineno2.txt"};
		subpath1.main(ss1);
	   	String[ ] ss8= {"-map","subway.txt","-a","s8号线","-o","linenos8.txt"};
		subpath1.main(ss8);
		String[ ] ss9= {"-map","subway.txt","-a","s9号线","-o","linenos9.txt"};
		subpath1.main(ss9);
		String[ ] shortpath= {"-map","subway.txt","-b","孝陵卫","南京站","-o","path1.txt"};
		subpath1.main(shortpath);
		String[ ] shortpath1= {"-map","subway.txt","-b","林场","南京站","-o","path2.txt"};
		subpath1.main(shortpath1);
		String[ ] shortpath2= {"-map","subway.txt","-b","泰冯路","红山动物园","-o","path3.txt"};
		subpath1.main(shortpath2);
		String[ ] shortpath3= {"-map","subway.txt","-b","铜山","奥体东","-o","path4.txt"};
		subpath1.main(shortpath3);
		String[ ] shortpath4= {"-map","subway.txt","-b","鸡鸣寺","南京南站","-o","path5.txt"};
		subpath1.main(shortpath4);
		String[ ] shortpath5= {"-map","subway.txt","-b","贾西","高淳","-o","path6.txt"};
		subpath1.main(shortpath5);
		String[ ] shortpath6= {"-map","subway.txt","-b","绿博园","天隆寺","-o","path7.txt"};
		subpath1.main(shortpath6);
		String[ ] shortpath7= {"-map","subway.txt","-b","安德门","信息工程大学","-o","path8.txt"};
		subpath1.main(shortpath7);
		String[ ] shortpath8= {"-map","subway.txt","-b","雨花门","九华山","-o","path9.txt"};
		subpath1.main(shortpath8);
		String[ ] shortpath9= {"-map","subway.txt","-b","云南路","明发广场","-o","path10.txt"};
		subpath1.main(shortpath9);
		
		
		
	}

}
