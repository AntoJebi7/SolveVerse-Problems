#include <iostream>
#include <vector>
using namespace std;
vector<int> twosum(vector<int>& v1,int target ){
    for (int i = 0; i < v1.size(); i++)
    {
        for (int j = i+1; j < v1.size(); j++)
        {
           if (v1[i]+v1[j]==target)
           {
            return {i,j};
           }
           
        }
        
        
    }
    return {};
}
int main(){
    vector<int> v1= {23,12,354,56,343};
    int target;
    cout<<"Enter Target to Search : "<<endl;
    cin>>target;
    vector<int> result = twosum(v1, target);

    if (!result.empty()) {
        cout << "Indices: " << result[0] << ", " << result[1] << endl;
    } else {
        cout << "No pair found that sums up to the target." << endl;
    }
     
    return 0;
}