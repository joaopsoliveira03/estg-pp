package interfaces;


import java.io.IOException;


/** Class responsible for the viewing the generated statistics */
public interface IOStatistics {
    
    /** Method responsible by showing the Dashboard given certain JSON files */
    void showDashboard(String[] args) throws IOException;
    
}
