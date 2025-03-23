module Tests where

import Test.QuickCheck
import Test.Hspec
import Exercises


main = hspec spec

spec = do
  describe "test" $ do
    it "test" $ do
      helloWorld "FreshMinds" `shouldBe` ("Hello FreshMinds")

