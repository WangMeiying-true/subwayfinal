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
		String[ ] ss= {"-map","subway.txt","-a","1����","-o","lineno1.txt"};
		subpath1.main(ss);
		String[] ss1= {"-map","subway.txt","-a","2����","-o","lineno2.txt"};
		subpath1.main(ss1);
	   	String[ ] ss8= {"-map","subway.txt","-a","s8����","-o","linenos8.txt"};
		subpath1.main(ss8);
		String[ ] ss9= {"-map","subway.txt","-a","s9����","-o","linenos9.txt"};
		subpath1.main(ss9);
		String[ ] shortpath= {"-map","subway.txt","-b","Т����","�Ͼ�վ","-o","path1.txt"};
		subpath1.main(shortpath);
		String[ ] shortpath1= {"-map","subway.txt","-b","�ֳ�","�Ͼ�վ","-o","path2.txt"};
		subpath1.main(shortpath1);
		String[ ] shortpath2= {"-map","subway.txt","-b","̩��·","��ɽ����԰","-o","path3.txt"};
		subpath1.main(shortpath2);
		String[ ] shortpath3= {"-map","subway.txt","-b","ͭɽ","���嶫","-o","path4.txt"};
		subpath1.main(shortpath3);
		String[ ] shortpath4= {"-map","subway.txt","-b","������","�Ͼ���վ","-o","path5.txt"};
		subpath1.main(shortpath4);
		String[ ] shortpath5= {"-map","subway.txt","-b","����","�ߴ�","-o","path6.txt"};
		subpath1.main(shortpath5);
		String[ ] shortpath6= {"-map","subway.txt","-b","�̲�԰","��¡��","-o","path7.txt"};
		subpath1.main(shortpath6);
		String[ ] shortpath7= {"-map","subway.txt","-b","������","��Ϣ���̴�ѧ","-o","path8.txt"};
		subpath1.main(shortpath7);
		String[ ] shortpath8= {"-map","subway.txt","-b","�껨��","�Ż�ɽ","-o","path9.txt"};
		subpath1.main(shortpath8);
		String[ ] shortpath9= {"-map","subway.txt","-b","����·","�����㳡","-o","path10.txt"};
		subpath1.main(shortpath9);
		
		
		
	}

}
