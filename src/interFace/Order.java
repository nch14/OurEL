package interFace;
import java.io.*;
import java.util.*;
//将所得分数与文档中的分数进行排序进行
public class Order {
	
	public static void main(String[] args)
	{
//		File f=new File("data");
//		if(!f.exists())
//		{
//			try
//			{
//				f.createNewFile();
//			}catch(IOException e)
//			{
//				e.printStackTrace();
//			}
//		}
		Order.order(50);

	}

	public static void order(int newpoint)
	{
		FileReader fr=null;
		FileWriter wr=null;
		BufferedReader br=null;
		BufferedWriter bw=null;
		int[] temporary=new int[11];
		try
		{
			fr=new FileReader("data");
			br=new BufferedReader(fr);
			String line=null;
			int n=0;
			
			Arrays.fill(temporary,0);
			temporary[10]=newpoint;
			int i=0;


//			将文档中的数字读入数组
			while((line=br.readLine())!=null)
			{
				temporary[i]=Integer.parseInt(line);
				i++;
			}

			
			
			//排序
			for(int k=0;k<10;k++)
			{
				for(int j=0;j<10-k;j++)
				{
					if(temporary[j]<temporary[j+1])
					{
						int temp=temporary[j];
						temporary[j]=temporary[j+1];
						temporary[j+1]=temp;
					}
				}
			}	
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}finally
		{
			try {
				fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		//写入文档
		try
		{
			wr=new FileWriter("data");
			bw=new BufferedWriter(wr);
			bw.write("");
			wr=new FileWriter("data",true);
			

					
			for(int x=0;x<10;x++)
			{
				bw.write(temporary[x]+"\r\n");
			}
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}finally
		{
			try {
				bw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
