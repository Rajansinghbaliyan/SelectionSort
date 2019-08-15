class SelectionSort extends Array{
  void selectSort()
  {
    int loc;
    int com=0;
    System.out.println("The Sorted Array is");
    for(int i= 0;i<size;i++){
      for (int j=0;j<size ;j++ ) {
        com++;
        if (arr[i]<arr[j]){
          loc= i;
          int swap = arr[j];
          arr[j]=arr[i];
          arr[i]=swap;
          loc= j;
        }
      }
    }
    System.out.println("the value of inputs="+size);
    System.out.println("the value of inputs^2="+size*size);
    System.out.println("the value of complexity ="+com);
  }
}
