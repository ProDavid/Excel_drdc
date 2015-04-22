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
 * Jxl创建Excel
 * 
 * @author Administrator
 *
 */
public class JxlExpExcel
{
	public static void main(String[] args)
	{
		//表头数据
		String[] title = {"id", "name", "age"}; 
		
		//创建文件
		File file = new File("F:\\space4self\\Excel_drdc\\jxl_excel.xls");
		
		//创建可写入的工作部
		WritableWorkbook workbook = null;
		//创建sheet页
		WritableSheet sheet = null;
		
		try
		{
			//给文件file创建新的工作部
			workbook = Workbook.createWorkbook(file);
			//给工作部workbook创建新的sheet页
			sheet = workbook.createSheet("sheet", 0);
			//创建一个标签
			Label label = null;
			
			//设置列名
			for(int i = 0; i < title.length; i++)
			{
				label = new Label(i, 0, title[i]);
				sheet.addCell(label);
			}
			
			//追加数据
			for(int i = 1; i < 10; i++)
			{
				label = new Label(0, i, i + "");
				sheet.addCell(label);
				
				label = new Label(1, i, "name" + i);
				sheet.addCell(label);
				
				label = new Label(2, i, (i * 2) + "");
				sheet.addCell(label);
			}
			
			//工作布写入操作
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
					//关闭流
					workbook.close();
				} catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		}
	}
}
