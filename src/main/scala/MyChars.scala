package main

object MyChars {

    def groupingChars(str: String) = {
        str.toSeq.groupBy(identity).toSeq.sortWith(_._2.length > _._2.length).map(_._2).mkString
    }
}