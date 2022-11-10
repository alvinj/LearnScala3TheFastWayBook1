// run with:
//     scala-cli ReadCsvFile.scala

// Purpose: Open a CSV file, split the rows into columns,
// then print every field of the 2nd column.
@main def readCsvFile =
    val bufferedSource = io.Source.fromFile("/Users/al/Desktop/Customers.csv")
    for line <- bufferedSource.getLines do
        val cols = line.split(",").map(_.trim)
        print(s"${cols(1)}, ")
    bufferedSource.close

