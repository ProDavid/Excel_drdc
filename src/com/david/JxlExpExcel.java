/**
 * 
 */
package com.david;

import java.io.File;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

/**
 * Jxl����Excel
 * 
 * @author Administrator
 *
 */
public class JxlExpExcel
{
	public static void main(String[] args)
	{
		//��ͷ����
		String[] title = {"id", "name", "age"}; 
		
		//�����ļ�
		File file = new File("F:\\space4self\\Excel_drdc\\jxl_excel.xls");
		
		//������д��Ĺ�����
		WritableWorkbook workbook = null;
		//����sheetҳ
		WritableSheet sheet = null;
		
		try
		{
			//���ļ�file�����µĹ�����
			workbook = Workbook.createWorkbook(file);
			//��������workbook�����µ�sheetҳ
			sheet = workbook.createSheet("sheet", 0);
			//����һ����ǩ
			Label label = null;
			
			//��������
			for(int i = 0; i < title.length; i++)
			{
				label = new Label(i, 0, title[i]);
				sheet.addCell(label);
			}
			
			//׷������
			for(int i = 1; i < 10; i++)
			{
				label = new Label(0, i, i + "");
				sheet.addCell(label);
				
				label = new Label(1, i, "name" + i);
				sheet.addCell(label);
				
				label = new Label(2, i, (i * 2) + "");
				sheet.addCell(label);
			}
			
			//������д�����
			workbook.write();
			
		} catch (Exception e)
		{
			e.printStackTrace();
		} finally
		{
			if(null != workbook)
			{
				try
				{
					//�ر���
					workbook.close();
				} catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		}
	}
}
