/**
 * 
 */
package com.david;

import java.io.File;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;

/**
 * Jxl读取Excel
 * @author Administrator
 *
 */
public class JxlReadExcel
{
	public static void main(String[] args)
	{
		//创建工作簿
		Workbook workbook = null;
		//创建sheet
		Sheet sheet = null;
		
		//获取file的工作簿
		try
		{
			workbook = Workbook.getWorkbook(new File("F:\\space4self\\Excel_drdc\\jxl_excel.xls"));
			sheet = workbook.getSheet(0);
			
			//获取sheet页的总行数
			for(int i = 0; i < sheet.getRows(); i++)
			{
				//获取sheet页的总列数
				for(int j = 0; j < sheet.getColumns(); j++)
				{
					//获取cell单元格（坐标为：列，行）
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
