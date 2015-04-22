/**
 * 
 */
package com.david;

import java.io.File;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;

/**
 * Jxl��ȡExcel
 * @author Administrator
 *
 */
public class JxlReadExcel
{
	public static void main(String[] args)
	{
		//����������
		Workbook workbook = null;
		//����sheet
		Sheet sheet = null;
		
		//��ȡfile�Ĺ�����
		try
		{
			workbook = Workbook.getWorkbook(new File("F:\\space4self\\Excel_drdc\\jxl_excel.xls"));
			sheet = workbook.getSheet(0);
			
			//��ȡsheetҳ��������
			for(int i = 0; i < sheet.getRows(); i++)
			{
				//��ȡsheetҳ��������
				for(int j = 0; j < sheet.getColumns(); j++)
				{
					//��ȡcell��Ԫ������Ϊ���У��У�
					Cell cell = sheet.getCell(j, i);
					System.out.print(cell.getContents() + " | ");
				}
				System.out.println();
			}
			
		} catch (Exception e)
		{
			e.printStackTrace();
		} finally
		{
			if(null != workbook)
			{
				workbook.close();
			}
		}
	}
}
