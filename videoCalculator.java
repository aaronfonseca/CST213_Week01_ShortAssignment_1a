/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cst213_week01_shortassignment_1a;

/**
 *
 * @author aaron.fonseca
 */
public class videoCalculator implements java.io.Serializable {
    private int resolution = 0;
    private double video_length = 0;
    private double file_size = 0;
    
    public videoCalculator(int resolution, double video_length ){
        setResolution(resolution);
        setVideo_length(video_length);
    }
    
    public void setResolution(int resolution){
        this.resolution = resolution;
    }
    
    public int getResolution(){
        return this.resolution;
    }
    
    public void setVideo_length(double video_length){
        this.video_length = video_length;
    }
    
    public double getVideo_length(){
        return this.video_length;
    }
    
    public double getFile_size(){
        if(getResolution() == 720){
            file_size = video_length * 5; // 5mbps is recommended biterate size per second for 720p video
        }else if(getResolution() == 1080){
            file_size = video_length * 8; // 8mbps is recommended biterate size per second for 720p video
        }
        return file_size;
    }
    
}
